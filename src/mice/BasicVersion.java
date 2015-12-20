/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mice;

import java.util.*; //Import of the java util package
import javax.swing.JComboBox;   //Import of the combobox

/**
 *
 * @author Victoria
 */
public class BasicVersion extends javax.swing.JFrame {

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
        btnSearch = new javax.swing.JButton();
        tfsearchField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tasearchResult = new javax.swing.JTextArea();
        paneProject = new javax.swing.JPanel();
        lblHeader1 = new javax.swing.JLabel();
        cbFunctions1 = new javax.swing.JComboBox<>();
        tfsearchField1 = new javax.swing.JTextField();
        btnSearch1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tasearchResult1 = new javax.swing.JTextArea();
        panePlatform = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tasearchResult2 = new javax.swing.JTextArea();
        btnSearch2 = new javax.swing.JButton();
        tfsearchField2 = new javax.swing.JTextField();
        cbFunctions2 = new javax.swing.JComboBox<>();
        lblHeader2 = new javax.swing.JLabel();
        paneCompetence = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tasearchResult3 = new javax.swing.JTextArea();
        btnSearch3 = new javax.swing.JButton();
        tfsearchField3 = new javax.swing.JTextField();
        cbFunctions3 = new javax.swing.JComboBox<>();
        lblHeader3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHeader.setText("Välj funktion:");

        cbFunctions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sök anställd i ett projekt", "Sök anställd i något annat" }));

        btnSearch.setText("Sök");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tfsearchField.setText("Sök...");

        tasearchResult.setColumns(20);
        tasearchResult.setRows(5);
        jScrollPane1.setViewportView(tasearchResult);

        javax.swing.GroupLayout paneHiredLayout = new javax.swing.GroupLayout(paneHired);
        paneHired.setLayout(paneHiredLayout);
        paneHiredLayout.setHorizontalGroup(
            paneHiredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneHiredLayout.createSequentialGroup()
                .addGroup(paneHiredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paneHiredLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblHeader)
                        .addGap(4, 4, 4)
                        .addComponent(cbFunctions, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfsearchField, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch))
                    .addGroup(paneHiredLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        paneHiredLayout.setVerticalGroup(
            paneHiredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneHiredLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(paneHiredLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader)
                    .addComponent(cbFunctions, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(tfsearchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(79, 79, 79)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        tpMenu.addTab("Anställd", paneHired);

        lblHeader1.setText("Välj funktion:");

        cbFunctions1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        tfsearchField1.setText("Sök...");

        btnSearch1.setText("Sök");

        tasearchResult1.setColumns(20);
        tasearchResult1.setRows(5);
        jScrollPane2.setViewportView(tasearchResult1);

        javax.swing.GroupLayout paneProjectLayout = new javax.swing.GroupLayout(paneProject);
        paneProject.setLayout(paneProjectLayout);
        paneProjectLayout.setHorizontalGroup(
            paneProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneProjectLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(paneProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paneProjectLayout.createSequentialGroup()
                        .addComponent(lblHeader1)
                        .addGap(18, 18, 18)
                        .addComponent(cbFunctions1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(tfsearchField1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch1)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        paneProjectLayout.setVerticalGroup(
            paneProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneProjectLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(paneProjectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader1)
                    .addComponent(cbFunctions1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfsearchField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch1))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        tpMenu.addTab("Spelprojekt", paneProject);

        tasearchResult2.setColumns(20);
        tasearchResult2.setRows(5);
        jScrollPane3.setViewportView(tasearchResult2);

        btnSearch2.setText("Sök");

        tfsearchField2.setText("Sök...");

        cbFunctions2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblHeader2.setText("Välj funktion:");

        javax.swing.GroupLayout panePlatformLayout = new javax.swing.GroupLayout(panePlatform);
        panePlatform.setLayout(panePlatformLayout);
        panePlatformLayout.setHorizontalGroup(
            panePlatformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panePlatformLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(panePlatformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panePlatformLayout.createSequentialGroup()
                        .addComponent(lblHeader2)
                        .addGap(18, 18, 18)
                        .addComponent(cbFunctions2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(tfsearchField2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch2)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        panePlatformLayout.setVerticalGroup(
            panePlatformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panePlatformLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(panePlatformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader2)
                    .addComponent(cbFunctions2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfsearchField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch2))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        tpMenu.addTab("Plattform", panePlatform);

        tasearchResult3.setColumns(20);
        tasearchResult3.setRows(5);
        jScrollPane4.setViewportView(tasearchResult3);

        btnSearch3.setText("Sök");

        tfsearchField3.setText("Sök...");

        cbFunctions3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        lblHeader3.setText("Välj funktion:");

        javax.swing.GroupLayout paneCompetenceLayout = new javax.swing.GroupLayout(paneCompetence);
        paneCompetence.setLayout(paneCompetenceLayout);
        paneCompetenceLayout.setHorizontalGroup(
            paneCompetenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCompetenceLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(paneCompetenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paneCompetenceLayout.createSequentialGroup()
                        .addComponent(lblHeader3)
                        .addGap(18, 18, 18)
                        .addComponent(cbFunctions3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(tfsearchField3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch3)))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        paneCompetenceLayout.setVerticalGroup(
            paneCompetenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneCompetenceLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(paneCompetenceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeader3)
                    .addComponent(cbFunctions3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfsearchField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch3))
                .addGap(43, 43, 43)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        tpMenu.addTab("Kompetensdomän", paneCompetence);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpMenu)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tpMenu)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
         //DbClass database = new DbClass();
//       ArrayList<String> enLista = database.listHiredInProject();
        String selectedFunction = cbFunctions.getSelectedItem().toString();
        switch (selectedFunction)
        {
            case "Sök anställd i ett projekt" : 
                listHired();
                break;
        }
        
        

    }//GEN-LAST:event_btnSearchActionPerformed

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
    
    private void listHired ()
    {
        tasearchResult.setText("");
        DbClass database = new DbClass();
        String searchWord = tfsearchField.getText();
        ArrayList<String> listHired = database.listHiredInProject(searchWord);
        for(String beteckning: listHired)
        {
            tasearchResult.append(beteckning + "\n");
        }
    }
        
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch1;
    private javax.swing.JButton btnSearch2;
    private javax.swing.JButton btnSearch3;
    private javax.swing.JComboBox<String> cbFunctions;
    private javax.swing.JComboBox<String> cbFunctions1;
    private javax.swing.JComboBox<String> cbFunctions2;
    private javax.swing.JComboBox<String> cbFunctions3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JLabel lblHeader1;
    private javax.swing.JLabel lblHeader2;
    private javax.swing.JLabel lblHeader3;
    private javax.swing.JPanel paneCompetence;
    private javax.swing.JPanel paneHired;
    private javax.swing.JPanel panePlatform;
    private javax.swing.JPanel paneProject;
    private javax.swing.JTextArea tasearchResult;
    private javax.swing.JTextArea tasearchResult1;
    private javax.swing.JTextArea tasearchResult2;
    private javax.swing.JTextArea tasearchResult3;
    private javax.swing.JTextField tfsearchField;
    private javax.swing.JTextField tfsearchField1;
    private javax.swing.JTextField tfsearchField2;
    private javax.swing.JTextField tfsearchField3;
    private javax.swing.JTabbedPane tpMenu;
    // End of variables declaration//GEN-END:variables
}
