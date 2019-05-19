package tiketbioskop;

public class FrameTiketBioskop extends javax.swing.JFrame {

    public FrameTiketBioskop() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnf_avengers = new javax.swing.JButton();
        btnf_next = new javax.swing.JButton();
        btnf_close = new javax.swing.JButton();
        btnf_hulk = new javax.swing.JButton();
        btnf_spiderman = new javax.swing.JButton();
        btnf_dilan = new javax.swing.JButton();
        btnf_pikachu = new javax.swing.JButton();
        btnf_mumun = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PILIH FILM");

        btnf_avengers.setText("AVENGERS");
        btnf_avengers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnf_avengersActionPerformed(evt);
            }
        });

        btnf_next.setText("NEXT");
        btnf_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnf_nextActionPerformed(evt);
            }
        });

        btnf_close.setText("CLOSE");
        btnf_close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnf_closeActionPerformed(evt);
            }
        });

        btnf_hulk.setText("HULK");
        btnf_hulk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnf_hulkActionPerformed(evt);
            }
        });

        btnf_spiderman.setText("SPIDERMAN");
        btnf_spiderman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnf_spidermanActionPerformed(evt);
            }
        });

        btnf_dilan.setText("DILAN");
        btnf_dilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnf_dilanActionPerformed(evt);
            }
        });

        btnf_pikachu.setText("PIKACHU");
        btnf_pikachu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnf_pikachuActionPerformed(evt);
            }
        });

        btnf_mumun.setText("MUMUN");
        btnf_mumun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnf_mumunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnf_mumun, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnf_dilan, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnf_pikachu, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnf_avengers, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnf_hulk, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnf_spiderman, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnf_close, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnf_next, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnf_avengers, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnf_hulk, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnf_spiderman, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnf_mumun, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnf_dilan, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnf_pikachu, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnf_next)
                    .addComponent(btnf_close))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnf_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnf_nextActionPerformed
        this.setVisible(false);
        new PilihJam().setVisible(true);
    }//GEN-LAST:event_btnf_nextActionPerformed

    private void btnf_closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnf_closeActionPerformed
        this.setVisible(false);
        new MenuUtama().setVisible(true);
        
        
    }//GEN-LAST:event_btnf_closeActionPerformed

    private void btnf_mumunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnf_mumunActionPerformed
        // TODO ad   d your handling code here:
    }//GEN-LAST:event_btnf_mumunActionPerformed

    private void btnf_pikachuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnf_pikachuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnf_pikachuActionPerformed

    private void btnf_dilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnf_dilanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnf_dilanActionPerformed

    private void btnf_spidermanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnf_spidermanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnf_spidermanActionPerformed

    private void btnf_hulkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnf_hulkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnf_hulkActionPerformed

    private void btnf_avengersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnf_avengersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnf_avengersActionPerformed

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
            java.util.logging.Logger.getLogger(FrameTiketBioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameTiketBioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameTiketBioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameTiketBioskop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameTiketBioskop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnf_avengers;
    private javax.swing.JButton btnf_close;
    private javax.swing.JButton btnf_dilan;
    private javax.swing.JButton btnf_hulk;
    private javax.swing.JButton btnf_mumun;
    private javax.swing.JButton btnf_next;
    private javax.swing.JButton btnf_pikachu;
    private javax.swing.JButton btnf_spiderman;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}