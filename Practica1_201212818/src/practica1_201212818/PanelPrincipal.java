package practica1_201212818;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class PanelPrincipal extends javax.swing.JFrame {
   
    File arch;
    boolean comprobacionx = true; 
    public static int dimension=0;    
    
    public PanelPrincipal() {
        initComponents();
        btnJugar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnJugar = new javax.swing.JButton();
        btnArchivo = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnJugar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica1_201212818/imagenes/jugar1.png"))); // NOI18N
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });

        btnArchivo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnArchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/practica1_201212818/imagenes/xml2.png"))); // NOI18N
        btnArchivo.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        btnArchivo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnArchivo.setInheritsPopupMenu(true);
        btnArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArchivoActionPerformed(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Pseudo-Scrabble");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(222, 222, 222)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(82, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnJugar, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        Object [] opciones ={"Si","No"};
        int eleccion = JOptionPane.showOptionDialog(rootPane,
                "Cerrar Aplicación?",
                "Pseudo-Scrabble",
        JOptionPane.YES_NO_CANCEL_OPTION,
        JOptionPane.QUESTION_MESSAGE,null,opciones,"Si");
        if (eleccion == JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }else{
        }
    }//GEN-LAST:event_btnSalirActionPerformed
    
    private void btnArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArchivoActionPerformed
       String cadena = abrirArchivo();        
       cargarXML(cadena);
       btnJugar.setEnabled(true);
    }//GEN-LAST:event_btnArchivoActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        
        final JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.setSize(100, 100);
        frame.setSize(100,100);

        JButton button1 = new JButton();

        final JLabel label = new JLabel("Hello World");

        label.setVisible(false);
        frame.add(panel);
        panel.add(button1);
        panel.add(label);
        frame.setVisible(true);

       /* button1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent arg0) {
                JOptionPane.showMessageDialog(frame.getComponent(0), "Hello World");
                label.setVisible(true);
            }
        });*/

        
        
        JTextArea textarea= new JTextArea("");
        textarea.setEditable(true);
        JOptionPane.showMessageDialog(panel.getComponent(0), panel.getComponent(0), "Pseudo-Scrabble", JOptionPane.INFORMATION_MESSAGE);
        
        panelJuego ver=new panelJuego();
        ver.setVisible(true);
        ver.setLocationRelativeTo(null);
        ver.setDefaultCloseOperation(ver.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_btnJugarActionPerformed

    public String abrirArchivo (){
        String contenido = "";        
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("Archivos de texto", "xml", "xml");
        JFileChooser archivo = new JFileChooser();
        archivo.setFileFilter(filtro);
        archivo.setDialogTitle("Archivos de Luis Enrique");
        int comparar = archivo.showOpenDialog(null);
        
        if (comparar == JFileChooser.APPROVE_OPTION) {
            arch = archivo.getSelectedFile();            
            try {
                FileInputStream f1 = new FileInputStream(arch);
                InputStreamReader f2 = new InputStreamReader(f1);
                BufferedReader linea = new BufferedReader(f2);                
                while (linea.ready()) {
                    String linea_arch = linea.readLine();
                    contenido = contenido + linea_arch + "\n";
                }
                linea.close();
                //txtentrada.setText(contenido);                
            } catch (Exception e) {
                e.printStackTrace();            
            }            
        }   
        return contenido;
    }
    
    public void cargarXML(String cadena)
    {    
        int inicioestado=0;              //El estado 0
        int estadoprincipal =0;         //Estado donde nos encontramos
        char cadenaconcatenar;         //cadena almacena token
        String token = "";            //token almacenado 
        
        for(inicioestado=0; inicioestado<cadena.length(); inicioestado++ ){
            
            cadenaconcatenar = cadena.charAt(inicioestado);              
            int codigoAscci = cadenaconcatenar;            
            
            switch(estadoprincipal){
            
                case 0: 
                    if(codigoAscci == 60){ //<
                        token += cadenaconcatenar;
                        estadoprincipal =1;
                       }                       
                    else if(cadenaconcatenar == ' '){
                       estadoprincipal =0;
                       }
                    else if(cadenaconcatenar == '\n'){
                       estadoprincipal =0;
                       }
                break;   
                    
                case 1: 
                    if(codigoAscci >= 97 && codigoAscci <= 122 ){ //Letras
                        token += cadenaconcatenar;
                        estadoprincipal =1;                        
                       } 
                    else if(codigoAscci >= 48 && codigoAscci <= 57 ){ //Digitos
                        token += cadenaconcatenar;
                        estadoprincipal =4;                        
                       } 
                    else if(codigoAscci == 47){ //'/
                        token += cadenaconcatenar;
                        estadoprincipal =3;                        
                       } 
                    else if(codigoAscci == 62){ //>
                        token += cadenaconcatenar;
                        //System.out.println(token);
                        if (token.equals("<dimension>")){
                            estadoprincipal =5;
                            token ="";
                        }
                        else{
                        estadoprincipal =2;
                        token ="";
                        }                        
                       }
                    else if(cadenaconcatenar == ' '){
                       estadoprincipal =0;
                       }
                    else if(cadenaconcatenar == '\n'){
                       estadoprincipal =0;
                       }
                break;
                    
                case 2: 
                    if(codigoAscci == 60){ //<
                        token += cadenaconcatenar;
                        estadoprincipal =1;                        
                       }
                    else if(codigoAscci >= 48 && codigoAscci <= 57 ){ //Digitos
                        token += cadenaconcatenar;
                        estadoprincipal =4;                        
                       }
                    else if(cadenaconcatenar == ' '){
                       estadoprincipal =0;
                       }
                    else if(cadenaconcatenar == '\n'){
                       estadoprincipal =0;
                       }
                break;                    
                    
                case 3: 
                    if(codigoAscci >= 97 && codigoAscci <= 122 ){ //Letras
                        token += cadenaconcatenar;
                        estadoprincipal =1;
                       }
                    else if(cadenaconcatenar == ' '){
                       estadoprincipal =0;
                       }
                    else if(cadenaconcatenar == '\n'){
                       estadoprincipal =0;
                       }
                break;
                    
                case 4: 
                    if(codigoAscci >= 48 && codigoAscci <= 57 ){ //Digitos
                        token += cadenaconcatenar;
                        estadoprincipal =4;        
                        //System.out.println(token);
                        token="";
                       } 
                    else if(codigoAscci == 60){ //<                                                
                        token += cadenaconcatenar;
                        estadoprincipal =1;                        
                       } 
                    else if(cadenaconcatenar == ' '){
                       estadoprincipal =0;
                       }
                    else if(cadenaconcatenar == '\n'){
                       estadoprincipal =0;
                       }
                break;
                
                case 5: 
                    if(codigoAscci >= 48 && codigoAscci <= 57 ){ //Digitos
                        token += cadenaconcatenar;
                        estadoprincipal =5;                        
                       } 
                    else if(codigoAscci == 60){ //<
                        dimension = Integer.parseInt(token);
                        token ="";
                        token += cadenaconcatenar;
                        estadoprincipal =1;
                        System.out.println("este es la dimension: " + dimension);
                       } 
                    else if(cadenaconcatenar == ' '){
                       estadoprincipal =0;
                       }
                    else if(cadenaconcatenar == '\n'){
                       estadoprincipal =0;
                       }               
                break;                        
            }
        }       
        
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
            //javax.swing.UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArchivo;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
