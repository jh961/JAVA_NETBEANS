package rs2321;

import java.io.*;
import javax.comm.*;

public class Escritor {

    OutputStream outputStream;
    SerialPort serialPort;
    Thread readThread;
    public static Escritor writerPort;

    private Escritor(SerialPort serialPort) {

        this.serialPort = serialPort;
        try {
            outputStream = serialPort.getOutputStream();
        } catch (IOException e) {
        }
        serialPort.notifyOnDataAvailable(true);
        try {

            serialPort.setSerialPortParams(9600,
                    SerialPort.DATABITS_8,
                    SerialPort.STOPBITS_1,
                    SerialPort.PARITY_NONE);
        } catch (UnsupportedCommOperationException e) {
        }
    }

    public static Escritor getInstance() {
        if (writerPort != null) {
            return writerPort;
        }

        writerPort = new Escritor(verificacion_puerto.getAbailablePort());

        return writerPort;

    }

    public void escribir(String strDatos) throws IOException {
        try {
            this.outputStream.write(strDatos.getBytes());
        } catch (IOException e) {
            throw e;

        }
    }
}
