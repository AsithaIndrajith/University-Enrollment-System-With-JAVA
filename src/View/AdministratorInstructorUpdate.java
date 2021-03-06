/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package View;

import static Controller.InstrcutorController.deleteInstructor;
import static Controller.InstrcutorController.insertInstructor;
import static Controller.InstrcutorController.searchInstrcutorByDepartmentID;
import static Controller.InstrcutorController.searchInstrcutorByInstructorID;
import static Controller.InstrcutorController.updateInstructor;
import Model.Instructor;
import static View.AdministratorHome.ins;
import static View.AdministratorLogin.administratorHome;
import static View.EnrollementSystemHome.depid;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asitha
 */
public class AdministratorInstructorUpdate extends javax.swing.JFrame {

    /**
     * Creates new form AdministratorInstructor
     */
    public AdministratorInstructorUpdate() {
        initComponents();
        this.loadInstructors();//load all instructors
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        insID = new javax.swing.JTextField();
        find = new javax.swing.JButton();
        nameTxt = new javax.swing.JTextField();
        nicTxt = new javax.swing.JTextField();
        addressTxt = new javax.swing.JTextField();
        telephoneTxt = new javax.swing.JTextField();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        addBtn = new javax.swing.JButton();
        pwdTxt = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        deleteBtn1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        instructor = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Administrator Instructor Management Panel");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel9.setText("Enter Instructor ID");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel2.setText("Instrcutor Name");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel3.setText("National Identity Card Number");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel6.setText("Address");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel4.setText("Telephone");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel1.setText("Password");

        insID.setPreferredSize(new java.awt.Dimension(550, 50));

        find.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        find.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search1.png"))); // NOI18N
        find.setText("Find Instrucor");
        find.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        find.setPreferredSize(new java.awt.Dimension(250, 50));
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });

        nameTxt.setPreferredSize(new java.awt.Dimension(550, 50));

        nicTxt.setPreferredSize(new java.awt.Dimension(550, 50));

        addressTxt.setPreferredSize(new java.awt.Dimension(550, 50));

        telephoneTxt.setPreferredSize(new java.awt.Dimension(550, 50));

        deleteBtn.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        deleteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/deleteBtn1.png"))); // NOI18N
        deleteBtn.setText("Delete Instrucor");
        deleteBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        deleteBtn.setMaximumSize(new java.awt.Dimension(250, 50));
        deleteBtn.setMinimumSize(new java.awt.Dimension(250, 50));
        deleteBtn.setPreferredSize(new java.awt.Dimension(250, 50));
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        updateBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update1.png"))); // NOI18N
        updateBtn.setText("Update Instrucor");
        updateBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        updateBtn.setMaximumSize(new java.awt.Dimension(250, 50));
        updateBtn.setMinimumSize(new java.awt.Dimension(250, 50));
        updateBtn.setPreferredSize(new java.awt.Dimension(250, 50));
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        addBtn.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        addBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/plus3.png"))); // NOI18N
        addBtn.setText("Add Instrucor");
        addBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        addBtn.setMaximumSize(new java.awt.Dimension(250, 50));
        addBtn.setMinimumSize(new java.awt.Dimension(250, 50));
        addBtn.setPreferredSize(new java.awt.Dimension(250, 50));
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        pwdTxt.setPreferredSize(new java.awt.Dimension(550, 50));

        jLabel11.setBackground(new java.awt.Color(0, 153, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setOpaque(true);

        deleteBtn1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        deleteBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close5.png"))); // NOI18N
        deleteBtn1.setText("Close");
        deleteBtn1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        deleteBtn1.setMaximumSize(new java.awt.Dimension(250, 50));
        deleteBtn1.setMinimumSize(new java.awt.Dimension(250, 50));
        deleteBtn1.setPreferredSize(new java.awt.Dimension(250, 50));
        deleteBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtn1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settings.png"))); // NOI18N
        jLabel10.setText("Instructor Management Panel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 663, Short.MAX_VALUE)
                        .addComponent(deleteBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nameTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nicTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addressTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(telephoneTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pwdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(find, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(deleteBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(updateBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(insID, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(insID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(find, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nicTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(123, 123, 123))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(telephoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pwdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(deleteBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Instructor Update", jPanel1);

        instructor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Instructor ID", "Instructor Name", "Instructor Address", "Instructor Contact"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(instructor);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1195, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1195, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Instructor Details", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //load all instrcutors
    void loadInstructors(){
        
        try {
            ArrayList<Instructor> instructors = searchInstrcutorByDepartmentID(depid);//search all intrscutors in department
            
            //add them to table
            DefaultTableModel dtm = (DefaultTableModel) instructor.getModel();
            dtm.setRowCount(0);
                 
            for (Instructor i : instructors) {
                Object[] rowData = {i.getInstructorID(),i.getInstructorName(),i.getInstructorAddress(),i.getInstructorPhone()};
                dtm.addRow(rowData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdministratorInstructorUpdate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdministratorInstructorUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    //refresh function to refresh feilds
    public void refresh(){
        nameTxt.setText("");
        addressTxt.setText("");
        nicTxt.setText("");
        telephoneTxt.setText("");
        pwdTxt.setText("");
    }
    private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed
        // Search instructor
        String id=insID.getText();
        try {
            ins=searchInstrcutorByInstructorID(id);
            if(ins==null){
                JOptionPane.showMessageDialog(rootPane, "Instrcutor record does not exist!!!");
                this.refresh();
            }
            else{
                nameTxt.setText(ins.getInstructorName());
                telephoneTxt.setText(ins.getInstructorPhone());
                addressTxt.setText(ins.getInstructorAddress());
                nicTxt.setText(ins.getInstructorNIC());
                pwdTxt.setText(ins.getInstructorPassword());
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdministratorUndergraduateUpdate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdministratorUndergraduateUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Try again later!!!");
        }
    }//GEN-LAST:event_findActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        
        // Delete instructor
        try {
            
            if(deleteInstructor(ins)>0){
                JOptionPane.showMessageDialog(rootPane,"Instructor record deleted successfully!!!");
                this.loadInstructors();
                this.refresh();
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdministratorUndergraduateUpdate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdministratorUndergraduateUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Try again later!!!");
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        
        //get required details and update instrructor
        String name=nameTxt.getText();
        String nic=nicTxt.getText();
        String phone=telephoneTxt.getText();
        String address=addressTxt.getText();
        String pwd=pwdTxt.getText();
        
        ins.setInstructorName(name);
        ins.setInstructorNIC(nic);
        ins.setInstructorPhone(phone);
        ins.setInstructorAddress(address);
        ins.setInstructorPassword(pwd);
        try {
            
            if(updateInstructor(ins)>0){
                JOptionPane.showMessageDialog(rootPane, "Update successfull!!!");
                this.loadInstructors();

            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Try again later!!!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(UndergraduateRegister.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UndergraduateRegister.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Try again later!!!");
        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        
        //cretate new instructor object and add it to the databse
        ins=new Instructor();
        
        String id=insID.getText();
        String name=nameTxt.getText();
        String nic=nicTxt.getText();
        String phone=telephoneTxt.getText();
        String address=addressTxt.getText();
        String pwd=pwdTxt.getText();
        
        ins.setInstructorID(id);
        ins.setInstructorName(name);
        ins.setInstructorNIC(nic);
        ins.setInstructorPhone(phone);
        ins.setInstructorAddress(address);
        ins.setInstructorPassword(pwd);
        ins.setDepID(depid);
        
        try {
            
            if(insertInstructor(ins)>0){
                JOptionPane.showMessageDialog(rootPane, "Added successfull!!!");
                this.loadInstructors();

            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Try again later!!!");
            }

        } catch (SQLException ex) {
            Logger.getLogger(UndergraduateRegister.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UndergraduateRegister.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Try again later!!!");
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void deleteBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtn1ActionPerformed
        this.dispose();
        administratorHome.setVisible(true);
        administratorHome.setLocationRelativeTo(null);
    }//GEN-LAST:event_deleteBtn1ActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdministratorInstructorUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministratorInstructorUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministratorInstructorUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministratorInstructorUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministratorInstructorUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextField addressTxt;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JButton deleteBtn1;
    private javax.swing.JButton find;
    private javax.swing.JTextField insID;
    private javax.swing.JTable instructor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JTextField nicTxt;
    private javax.swing.JPasswordField pwdTxt;
    private javax.swing.JTextField telephoneTxt;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
