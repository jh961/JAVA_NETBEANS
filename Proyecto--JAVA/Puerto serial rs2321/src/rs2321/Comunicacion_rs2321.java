package rs2321;

import java.io.*;

public class Comunicacion_rs2321 extends javax.swing.JFrame {

    Escritor emi;
    Lector rea;
    String d = "";
    float a,b,c; 

    public Comunicacion_rs2321() {

        initComponents();

        this.emi = Escritor.getInstance();
        this.rea = Lector.getInstance();
        this.rea.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Evento_puerto actionEventPort = (Evento_puerto) evt;
               // datos_recibidos(actionEventPort);
            }
        });



    }

 

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Boton_Enviar = new javax.swing.JButton();
        Pos1 = new javax.swing.JLabel();
        Pos2 = new javax.swing.JLabel();
        Pos3 = new javax.swing.JLabel();
        movi3 = new javax.swing.JScrollBar();
        movi1 = new javax.swing.JScrollBar();
        movi2 = new javax.swing.JScrollBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Comunicacion-RS232");
        getContentPane().setLayout(null);

        Boton_Enviar.setBackground(new java.awt.Color(255, 255, 204));
        Boton_Enviar.setFont(new java.awt.Font("Snap ITC", 2, 18)); // NOI18N
        Boton_Enviar.setForeground(new java.awt.Color(51, 51, 255));
        Boton_Enviar.setText("ENVIAR");
        Boton_Enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EnviarActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_Enviar);
        Boton_Enviar.setBounds(60, 360, 120, 30);

        Pos1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(Pos1);
        Pos1.setBounds(50, 300, 50, 30);

        Pos2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(Pos2);
        Pos2.setBounds(170, 300, 50, 30);

        Pos3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(Pos3);
        Pos3.setBounds(290, 300, 50, 30);

        movi3.setValue(50);
        getContentPane().add(movi3);
        movi3.setBounds(300, 50, 30, 240);

        movi1.setValue(50);
        getContentPane().add(movi1);
        movi1.setBounds(60, 40, 30, 240);

        movi2.setValue(50);
        getContentPane().add(movi2);
        movi2.setBounds(180, 50, 30, 240);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-691)/2, (screenSize.height-477)/2, 691, 477);
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_EnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EnviarActionPerformed


        
        try {
            
            a=movi1.getValue();
            b=movi2.getValue();
            c=movi3.getValue();
            
            
            d = ("@"+a+"."+b+","+c+"#");

            Pos1.setText(String.valueOf(a));
            Pos2.setText(String.valueOf(b));
            Pos3.setText(String.valueOf(c));
            
            
            emi.escribir(d);

            


        } catch (IOException iOException) {
        }
        
    }//GEN-LAST:event_Boton_EnviarActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Comunicacion_rs2321().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Enviar;
    private javax.swing.JLabel Pos1;
    private javax.swing.JLabel Pos2;
    private javax.swing.JLabel Pos3;
    private javax.swing.JScrollBar movi1;
    private javax.swing.JScrollBar movi2;
    private javax.swing.JScrollBar movi3;
    // End of variables declaration//GEN-END:variables
}
