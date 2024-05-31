package rs2321;


import javax.comm.*;
import java.util.*;


public class verificacion_puerto {

    private static SerialPort serialPort;

    public static SerialPort getAbailablePort() {
       
        if (serialPort != null) {
            return serialPort;
        }
        CommPortIdentifier portId;
        Enumeration portList;
        portList = CommPortIdentifier.getPortIdentifiers();

        while (portList.hasMoreElements()) {

            portId = (CommPortIdentifier) portList.nextElement();
            if (portId.getPortType() == CommPortIdentifier.PORT_SERIAL) {

                if (portId.getName().equals("COM1")) {
                    try {
                        serialPort = (SerialPort) portId.open("Ocupado", 2000);
                    } catch (PortInUseException e) {
                    }

                }
            }
        }

        return serialPort;

    }
}
