package HotelReservationSystem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class LauncherForm extends javax.swing.JFrame {
    private Timer t = null;
    private int count = 0;
    public LauncherForm() {
        initComponents();
        progbar_load.setVisible(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        progbar_load = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        launcherbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        progbar_load.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        progbar_load.setForeground(new java.awt.Color(0, 0, 0));
        progbar_load.setStringPainted(true);
        getContentPane().add(progbar_load, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 530, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Created by: Cadalin | Esguerra | Manansala | Mante | Quimson | Roque | Sarayan | Villa");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 480, 20));

        launcherbg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/HotelReservationSystem/img/launcher.png"))); // NOI18N
        launcherbg.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                launcherbgMouseWheelMoved(evt);
            }
        });
        getContentPane().add(launcherbg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void launcherbgMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_launcherbgMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_launcherbgMouseWheelMoved

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       t = new Timer(50,new ActionListener(){
           public void actionPerformed(ActionEvent e){
               count++;
               progbar_load.setValue(count);
               if(progbar_load.getValue()<100)
               {
                  progbar_load.setValue(progbar_load.getValue()+1);
               }
               LoginForms logfrm = new LoginForms();
               if(progbar_load.getValue()==100){
                   logfrm.setVisible(true);
                   t.stop();
                   LauncherForm.this.dispose();

                   
               }
       }
           });
    
    t.start();
      
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LauncherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LauncherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LauncherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LauncherForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LauncherForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel launcherbg;
    private javax.swing.JProgressBar progbar_load;
    // End of variables declaration//GEN-END:variables
}
