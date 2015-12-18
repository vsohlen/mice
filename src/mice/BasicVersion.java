/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mice;

import java.util.*;
import javax.swing.JComboBox;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Victoria
 */
public class BasicVersion extends javax.swing.JFrame {

    private InfDB idb;
    /**
     * Creates new form BasicVersion
     */
    public BasicVersion() {
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

        tpMenu = new javax.swing.JTabbedPane();
        paneHired = new javax.swing.JPanel();
        lblHeader = new javax.swing.JLabel();
        cbFunctions = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        cbsearchHits = new javax.swing.JComboBox<>();
        btnTestRun = new javax.swing.JButton();
        paneProject = new javax.swing.JPanel();
        panePlatform = new javax.swing.JPanel();
        paneCompetence = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHeader.setText("Välj funktion:");

        cbFunctions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("jButton1");

        btnTestRun.setText("jButton2");
        btnTestRun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTestRunMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout paneHiredLayout = new javax.swing.GroupLayout(paneHired);
        paneHired.setLayout(paneHiredLayout);
        paneHiredLayout.setHorizontalGroup(
            paneHiredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneHiredLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblHeader)
                .addGap(34, 34, 34)
                .addGroup(paneHiredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneHiredLayout.createSequentialGroup()
                        .addComponent(cbFunctions, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(paneHiredLayout.createSequentialGroup()
                        .addComponent(cbsearchHits, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnTestRun)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        paneHiredLayout.setVerticalGroup(
            paneHiredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneHiredLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(paneHiredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader)
                    .addComponent(cbFunctions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(38, 38, 38)
                .addGroup(paneHiredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbsearchHits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTestRun))
                .addContainerGap(280, Short.MAX_VALUE))
        );

        tpMenu.addTab("Anställd", paneHired);

        javax.swing.GroupLayout paneProjectLayout = new javax.swing.GroupLayout(paneProject);
        paneProject.setLayout(paneProjectLayout);
        paneProjectLayout.setHorizontalGroup(
            paneProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );
        paneProjectLayout.setVerticalGroup(
            paneProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        tpMenu.addTab("Spelprojekt", paneProject);

        javax.swing.GroupLayout panePlatformLayout = new javax.swing.GroupLayout(panePlatform);
        panePlatform.setLayout(panePlatformLayout);
        panePlatformLayout.setHorizontalGroup(
            panePlatformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );
        panePlatformLayout.setVerticalGroup(
            panePlatformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        tpMenu.addTab("Plattform", panePlatform);

        javax.swing.GroupLayout paneCompetenceLayout = new javax.swing.GroupLayout(paneCompetence);
        paneCompetence.setLayout(paneCompetenceLayout);
        paneCompetenceLayout.setHorizontalGroup(
            paneCompetenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 599, Short.MAX_VALUE)
        );
        paneCompetenceLayout.setVerticalGroup(
            paneCompetenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 402, Short.MAX_VALUE)
        );

        tpMenu.addTab("Kompetensdomän", paneCompetence);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tpMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTestRunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTestRunMouseClicked
        //getHiredInProject();
    }//GEN-LAST:event_btnTestRunMouseClicked

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
            java.util.logging.Logger.getLogger(BasicVersion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BasicVersion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BasicVersion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BasicVersion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BasicVersion().setVisible(true);
            }
        });
    }  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTestRun;
    private javax.swing.JComboBox<String> cbFunctions;
    private javax.swing.JComboBox<String> cbsearchHits;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JPanel paneCompetence;
    private javax.swing.JPanel paneHired;
    private javax.swing.JPanel panePlatform;
    private javax.swing.JPanel paneProject;
    private javax.swing.JTabbedPane tpMenu;
    // End of variables declaration//GEN-END:variables
}
