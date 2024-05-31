package rs2321;


import java.io.*;
import javax.comm.*;
import java.util.*;

    public class Lector  implements Runnable, SerialPortEventListener {

        private static Lector readerPort;
        private InputStream inputStream;
        private SerialPort serialPort;
        private Thread readThread;
        private String stringBuffer = "";
        private ArrayList listeners;

    
    private Lector(SerialPort serialPort) {
       

        this.serialPort = serialPort;
        
        try {
            inputStream = serialPort.getInputStream();
        } catch (IOException e) {}
	try {
            serialPort.addEventListener(this);
	} catch (TooManyListenersException e) {}
        serialPort.notifyOnDataAvailable(true);
        try {
            serialPort.setSerialPortParams(9600,
                SerialPort.DATABITS_8,
                SerialPort.STOPBITS_1,
                SerialPort.PARITY_NONE);
                
        } catch (UnsupportedCommOperationException e) {}
        readThread = new Thread(this);
        readThread.start();
    }
    
    public static Lector getInstance()
    {
        if (readerPort != null )
            return readerPort;
        
        readerPort = new Lector(verificacion_puerto.getAbailablePort());
        return readerPort;
    }

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {}
    }

       
    public void serialEvent(SerialPortEvent event) {

        java.awt.event.ActionListener oyente;
        Evento_puerto actionEventPort;
        
        switch(event.getEventType()) {
        case SerialPortEvent.BI:
        case SerialPortEvent.OE:
        case SerialPortEvent.FE:
        case SerialPortEvent.PE:
        case SerialPortEvent.CD:
        case SerialPortEvent.CTS:
        case SerialPortEvent.DSR:
        case SerialPortEvent.RI:
        case SerialPortEvent.OUTPUT_BUFFER_EMPTY:
            break;
        case SerialPortEvent.DATA_AVAILABLE:
            byte[] readBuffer = new byte[50];
            String stringBuffer= "";
            try {
                while (inputStream.available() > 0) {
                    int numBytes = inputStream.read(readBuffer);
                    stringBuffer+= new String(readBuffer,0 ,numBytes );
                }
                actionEventPort = new Evento_puerto(this, 0, "Readed", stringBuffer );
                for (int i =0; i < this.listeners.size(); i++ )
                {
                    oyente = (java.awt.event.ActionListener)this.listeners.get(i);
                    oyente.actionPerformed(actionEventPort);
                }
                               
                
            } catch (IOException e) {}
            break;
        }
    }
    
    
    
    
    public void addActionListener(java.awt.event.ActionListener oyente)
    {
  
        if (this.listeners == null)
        {
            this.listeners = new ArrayList();
        }
        
        this.listeners.add(oyente); 
    }
    
  
}

