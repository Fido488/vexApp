package guiFrames;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
/**
 *
 * @author jonathanleitschuh
 */
import ActionPacks.*;
import Objects.TeamObject;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class teamsListFrame extends javax.swing.JFrame {

    private int length;

    /**
     * Creates new form teamsListFrame
     */
    public teamsListFrame() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        teamListFrame = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();

        //MY INSERTED CODE FOR THE ARRAY LIST HANDLER
        //Edit in teamList Code menu under Pre-Creation Code
        DefaultListModel listModelTeams = new DefaultListModel();
        teamNameReader read = new teamNameReader();
        ArrayList<TeamObject> readConfig = null;
        try {
            readConfig = read.readTeamNameObject();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(teamsListFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (TeamObject item : readConfig) {
            listModelTeams.addElement(item.getTeamList());
        }
        length = listModelTeams.size();

        //MY INSERTED CODE FOR THE ARRAY LIST HANDLER END
        teamList = new javax.swing.JList();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        newTeamButton = new javax.swing.JButton();
        editTeamButton = new javax.swing.JButton();
        deleteTeamButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        csvExport = new javax.swing.JButton();
        csvImport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VEX Alliance Selection App");
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0};
        layout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        getContentPane().setLayout(layout);

        teamListFrame.setBorder(javax.swing.BorderFactory.createTitledBorder("Team List:"));
        teamListFrame.setMaximumSize(new java.awt.Dimension(597, 2147483647));
        teamListFrame.setPreferredSize(new java.awt.Dimension(597, 300));
        java.awt.GridBagLayout teamListFrameLayout = new java.awt.GridBagLayout();
        teamListFrameLayout.columnWidths = new int[] {0, 5, 0, 5, 0, 5, 0, 5, 0, 5, 0};
        teamListFrameLayout.rowHeights = new int[] {0, 5, 0, 5, 0, 5, 0};
        teamListFrame.setLayout(teamListFrameLayout);

        jScrollPane1.setPreferredSize(new java.awt.Dimension(260, 160));

        teamList.setModel(listModelTeams);
        teamList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        teamList.setToolTipText("Select");
        teamList.setMaximumSize(new java.awt.Dimension(39, 500));
        teamList.setMinimumSize(new java.awt.Dimension(39, 120));
        teamList.setPreferredSize(new java.awt.Dimension(39, 120));
        jScrollPane1.setViewportView(teamList);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 325;
        gridBagConstraints.ipady = 50;
        teamListFrame.add(jScrollPane1, gridBagConstraints);

        jLabel1.setText("ID");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 8, 0, 0);
        teamListFrame.add(jLabel1, gridBagConstraints);

        jLabel2.setText("Team #");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 44, 0, 0);
        teamListFrame.add(jLabel2, gridBagConstraints);

        jLabel3.setText("Team Name");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 60, 0, 0);
        teamListFrame.add(jLabel3, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 13;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 90;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        getContentPane().add(teamListFrame, gridBagConstraints);

        newTeamButton.setText("New Team");
        newTeamButton.setToolTipText("Create a new team.");
        newTeamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTeamButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.insets = new java.awt.Insets(40, 0, 0, 0);
        getContentPane().add(newTeamButton, gridBagConstraints);

        editTeamButton.setText("Edit Team");
        editTeamButton.setToolTipText("Edit a pre-existing team.");
        editTeamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editTeamButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        getContentPane().add(editTeamButton, gridBagConstraints);

        deleteTeamButton.setText("Delete");
        deleteTeamButton.setToolTipText("Delete this team.");
        deleteTeamButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteTeamButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        getContentPane().add(deleteTeamButton, gridBagConstraints);

        backButton.setText("<< Back");
        backButton.setToolTipText("Go back to main screen.");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 0, 0);
        getContentPane().add(backButton, gridBagConstraints);

        jLabel4.setText("Note: Deleting a team has been disabled");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 200;
        getContentPane().add(jLabel4, gridBagConstraints);

        csvExport.setText("Export .csv");
        csvExport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csvExportActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_START;
        getContentPane().add(csvExport, gridBagConstraints);

        csvImport.setText("Import .csv");
        csvImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                csvImportActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.insets = new java.awt.Insets(50, 0, 0, 0);
        getContentPane().add(csvImport, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        // TODO add your handling code here:
        startFrameSimple frame = new startFrameSimple();
        frame.setSize(this.getWidth(), getHeight());
        frame.setLocation(this.getX(), this.getY());
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void newTeamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTeamButtonActionPerformed
        // TODO add your handling code here:
        newTeamsFrame frame = new newTeamsFrame(length);
        frame.setSize(this.getWidth(), getHeight());
        frame.setLocation(this.getX(), this.getY());
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_newTeamButtonActionPerformed

    private void editTeamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editTeamButtonActionPerformed
        // TODO add your handling code here:

        try {
            //Get the selected team from the list
            int selected = teamList.getSelectedIndex();

            teamNameReader set = new teamNameReader();
            ArrayList<TeamObject> read = null;
            try {
                read = set.readTeamNameObject();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(teamsListFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

            editTeamsFrame frame = null;
            try {
                frame = new editTeamsFrame(read.get(selected).getTeamNumb(), read.get(selected).getTeamLetter());
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(teamsListFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            frame.setSize(this.getWidth(), getHeight());
            frame.setLocation(this.getX(), this.getY());
            frame.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Please Select a Team From the List", "ERROR", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_editTeamButtonActionPerformed

    private void deleteTeamButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteTeamButtonActionPerformed
        /*
         * try { //Get the selected team from the list int selected =
         * teamList.getSelectedIndex(); teamNameReader set = new
         * teamNameReader(); ArrayList<TeamObject> read = null; try { read =
         * set.readTeamNameObject(); } catch (ClassNotFoundException ex) {
         * Logger.getLogger(teamsListFrame.class.getName()).log(Level.SEVERE,
         * null, ex); } read.remove(selected);
         *
         * teamNameWriter write = new teamNameWriter();
         * write.replaceTeamObject(read);
         *
         * teamsListFrame frame = new teamsListFrame();
         * frame.setSize(this.getWidth(), getHeight());
         * frame.setLocation(this.getX(), this.getY()); frame.setVisible(true);
         * this.dispose();
         *
         * } catch (Exception e) { JOptionPane.showMessageDialog(this, "Please
         * Select a Team From the List", "ERROR", JOptionPane.ERROR_MESSAGE); }
         */
    }//GEN-LAST:event_deleteTeamButtonActionPerformed

    private void csvImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csvImportActionPerformed
        // TODO add your handling code here:
        csvReader read = new csvReader();
        teamNameWriter write = new teamNameWriter();

        try {
            write.replaceTeamObject(read.readTeamObject());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(teamsListFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        teamsListFrame frame = new teamsListFrame();
        frame.setSize(this.getWidth(), getHeight());
        frame.setLocation(this.getX(), this.getY());
        frame.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_csvImportActionPerformed

    private void csvExportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_csvExportActionPerformed
        // TODO add your handling code here:
        teamNameReader read = new teamNameReader();
        csvWriter write = new csvWriter();
        try {
            write.writeOld(read.readTeamNameObject());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(teamsListFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_csvExportActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(teamsListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teamsListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teamsListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teamsListFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton backButton;
    private javax.swing.JButton csvExport;
    private javax.swing.JButton csvImport;
    private javax.swing.JButton deleteTeamButton;
    private javax.swing.JButton editTeamButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newTeamButton;
    private javax.swing.JList teamList;
    private javax.swing.JPanel teamListFrame;
    // End of variables declaration//GEN-END:variables
}
