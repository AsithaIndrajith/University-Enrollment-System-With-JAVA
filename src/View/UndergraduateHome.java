/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import static Controller.AssignmentGradeController.searchAssignmentGradeByStudentID;
import static Controller.ExamGradeController.searchExamGradeByStudentID;
import Controller.UndergraduateController;
import static Controller.UndergraduateController.updateUndergraduatePersonal;
import Model.AssignmentGrades;
import Model.ExamGrades;
import static View.EnrollementSystemHome.hm;
import static View.UndergraduateLogin.un;
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
public class UndergraduateHome extends javax.swing.JFrame {

    public static javax.swing.JTextField getAddressTxt() {
        return addressTxt;
    }

    public static void setAddressTxt(javax.swing.JTextField aAddressTxt) {
        addressTxt = aAddressTxt;
    }

    public static javax.swing.JTextField getDobTxt() {
        return dobTxt;
    }

    public static void setDobTxt(javax.swing.JTextField aDobTxt) {
        dobTxt = aDobTxt;
    }

    public static javax.swing.JTextField getNameTxt() {
        return nameTxt;
    }

    public static void setNameTxt(javax.swing.JTextField aNameTxt) {
        nameTxt = aNameTxt;
    }

    public static javax.swing.JTextField getNicTxt() {
        return nicTxt;
    }

    public static void setNicTxt(javax.swing.JTextField aNicTxt) {
        nicTxt = aNicTxt;
    }

    public static javax.swing.JTextField getTelephoneTxt() {
        return telephoneTxt;
    }

    public static void setTelephoneTxt(javax.swing.JTextField aTelephoneTxt) {
        telephoneTxt = aTelephoneTxt;
    }
    /**
     * Creates new form UndergraduateProfile
     */
    public UndergraduateHome() {
        initComponents();
        this.loadDetails();
        this.loadAssignmentResults();
        this.loadExamResults();
    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        telephoneTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nicTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        dobTxt = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        updateDetailsBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        changePAsswordBtn = new javax.swing.JButton();
        secPswd = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        frstPswd = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        updateBtn1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        examResults = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        assignmentResults = new javax.swing.JTable();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Undergraduate Management Panel");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1000, 700));

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel4.setText("Name");
        jLabel4.setMaximumSize(new java.awt.Dimension(100, 50));
        jLabel4.setMinimumSize(new java.awt.Dimension(100, 50));
        jLabel4.setPreferredSize(new java.awt.Dimension(100, 50));

        nameTxt.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        nameTxt.setAlignmentX(2.0F);
        nameTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nameTxt.setEnabled(false);
        nameTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel5.setText("Phone");
        jLabel5.setMaximumSize(new java.awt.Dimension(100, 50));
        jLabel5.setMinimumSize(new java.awt.Dimension(100, 50));
        jLabel5.setPreferredSize(new java.awt.Dimension(100, 50));

        telephoneTxt.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        telephoneTxt.setAlignmentX(2.0F);
        telephoneTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        telephoneTxt.setEnabled(false);
        telephoneTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel6.setText("National Identity Card");
        jLabel6.setMaximumSize(new java.awt.Dimension(100, 50));
        jLabel6.setMinimumSize(new java.awt.Dimension(100, 50));
        jLabel6.setPreferredSize(new java.awt.Dimension(100, 50));

        nicTxt.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        nicTxt.setAlignmentX(2.0F);
        nicTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nicTxt.setEnabled(false);
        nicTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel11.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel11.setText("Address");
        jLabel11.setMaximumSize(new java.awt.Dimension(100, 50));
        jLabel11.setMinimumSize(new java.awt.Dimension(100, 50));
        jLabel11.setPreferredSize(new java.awt.Dimension(100, 50));

        addressTxt.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        addressTxt.setAlignmentX(2.0F);
        addressTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        addressTxt.setEnabled(false);
        addressTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel7.setText("Date Of Birth");

        dobTxt.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        dobTxt.setAlignmentX(2.0F);
        dobTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        dobTxt.setEnabled(false);
        dobTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        jButton4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/editBtn.png"))); // NOI18N
        jButton4.setText("Edit Details");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        updateDetailsBtn.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        updateDetailsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update1.png"))); // NOI18N
        updateDetailsBtn.setText("Update Details");
        updateDetailsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateDetailsBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        updateDetailsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateDetailsBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel1.setText("Type your password");

        changePAsswordBtn.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        changePAsswordBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/changePasswordBtn1.png"))); // NOI18N
        changePAsswordBtn.setText("Change Password");
        changePAsswordBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changePAsswordBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        changePAsswordBtn.setPreferredSize(new java.awt.Dimension(50, 50));
        changePAsswordBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePAsswordBtnActionPerformed(evt);
            }
        });

        secPswd.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        secPswd.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel3.setText("Retype password");

        frstPswd.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        frstPswd.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel14.setBackground(new java.awt.Color(0, 102, 204));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setOpaque(true);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 19)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/accountBtn1.png"))); // NOI18N
        jLabel8.setText("Personal Details");
        jLabel8.setMaximumSize(new java.awt.Dimension(100, 50));
        jLabel8.setMinimumSize(new java.awt.Dimension(100, 50));
        jLabel8.setPreferredSize(new java.awt.Dimension(100, 50));

        jLabel9.setBackground(new java.awt.Color(51, 255, 255));
        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 19)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/passwordBtn1.png"))); // NOI18N
        jLabel9.setText("Change Password");
        jLabel9.setMaximumSize(new java.awt.Dimension(100, 50));
        jLabel9.setMinimumSize(new java.awt.Dimension(100, 50));
        jLabel9.setPreferredSize(new java.awt.Dimension(100, 50));

        updateBtn1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        updateBtn1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close5.png"))); // NOI18N
        updateBtn1.setText("Close");
        updateBtn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBtn1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        updateBtn1.setPreferredSize(new java.awt.Dimension(50, 50));
        updateBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateBtn1MouseEntered(evt);
            }
        });
        updateBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(118, 118, 118)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(telephoneTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nicTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addressTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dobTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 347, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(updateDetailsBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(frstPswd, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                            .addComponent(secPswd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(changePAsswordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(updateBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telephoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nicTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dobTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateDetailsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel1)
                                .addGap(43, 43, 43)
                                .addComponent(jLabel3)
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(frstPswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(secPswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changePAsswordBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 767, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Undergraduate Details", jPanel1);

        examResults.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        examResults.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Subject ID", "Result", "Grade", "Year", "Semester"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(examResults);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1195, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1195, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Exam Results", jPanel3);

        assignmentResults.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Subject ID", "Assignment ID", "Assignment Type", "Result", "Grade", "Year", "Semester"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(assignmentResults);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1195, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Assignment Results", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void loadAssignmentResults(){
        try {
            ArrayList<AssignmentGrades>assignmentGradeses=searchAssignmentGradeByStudentID(un.getId());
            if(assignmentGradeses.size()>0){
                DefaultTableModel dtm = (DefaultTableModel) assignmentResults.getModel();
                dtm.setRowCount(0);
                for(AssignmentGrades grades: assignmentGradeses){
                    Object[] rowData = {grades.getStudentID(),grades.getSubjectID(),grades.getAsgnmtnID(),grades.getAssignmentType(),grades.getResult(),grades.getGrade(),grades.getYear(),grades.getSemester()};
                    dtm.addRow(rowData);
                }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostgraduateHome.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PostgraduateHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void loadExamResults(){
        try {
            ArrayList<ExamGrades>examGrade=searchExamGradeByStudentID(un.getId());
            if(examGrade.size()>0){
                DefaultTableModel dtm = (DefaultTableModel) examResults.getModel();
                dtm.setRowCount(0);
                for(ExamGrades grades: examGrade){
                    Object[] rowData = {grades.getStudentID(),grades.getSubjectID(),grades.getResult(),grades.getGrade(),grades.getYear(),grades.getSemester()};
                    dtm.addRow(rowData);
                }
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(PostgraduateHome.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PostgraduateHome.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void loadDetails(){
        nameTxt.setText(un.getName());
        addressTxt.setText(un.getAddress());
        nicTxt.setText(un.getNic());
        dobTxt.setText(un.getDob());
        telephoneTxt.setText(un.getTelephone());
        
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        getNameTxt().setEnabled(true);
        getAddressTxt().setEnabled(true);
        getNicTxt().setEnabled(true);
        getDobTxt().setEnabled(true);
        getTelephoneTxt().setEnabled(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void updateDetailsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateDetailsBtnActionPerformed
        un.setId(un.getId());
        un.setName(getNameTxt().getText());
        un.setAddress(getAddressTxt().getText());
        un.setDob(getDobTxt().getText());
        un.setNic(getNicTxt().getText());
        un.setTelephone(getTelephoneTxt().getText());

        
        try {
            if(updateUndergraduatePersonal(un)>0){
                JOptionPane.showMessageDialog(rootPane, "Update Successfully!!!");
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Try again later!!!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UndergraduateHome.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UndergraduateHome.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Try again later!!!");
        }
        

    }//GEN-LAST:event_updateDetailsBtnActionPerformed

    private void changePAsswordBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePAsswordBtnActionPerformed
    

        if(frstPswd.getText().equals(secPswd.getText())){
            un.setPassword(frstPswd.getText());
            
                int rst=0;
            try {
                rst = UndergraduateController.updateUndergraduatePassword(un);
            } catch (SQLException ex) {
                Logger.getLogger(UndergraduateHome.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UndergraduateHome.class.getName()).log(Level.SEVERE, null, ex);
            }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Try again later!!!");
        }
                if(rst==1){
                    JOptionPane.showMessageDialog(rootPane, "Password updated succesfully!!!");
                }
                else{
                    JOptionPane.showMessageDialog(rootPane, "Something went wrong.");
                }
            
        }
        else{
            JOptionPane.showMessageDialog(rootPane, "Passwords does not match");
        }
    }//GEN-LAST:event_changePAsswordBtnActionPerformed

    private void updateBtn1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBtn1MouseEntered

    }//GEN-LAST:event_updateBtn1MouseEntered

    private void updateBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtn1ActionPerformed
       this.dispose();
        hm.setVisible(true);
        hm.setLocationRelativeTo(null);
    }//GEN-LAST:event_updateBtn1ActionPerformed
    
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
            java.util.logging.Logger.getLogger(UndergraduateHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UndergraduateHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UndergraduateHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UndergraduateHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UndergraduateHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JTextField addressTxt;
    private javax.swing.JTable assignmentResults;
    private javax.swing.JButton changePAsswordBtn;
    private static javax.swing.JTextField dobTxt;
    private javax.swing.JTable examResults;
    private javax.swing.JTextField frstPswd;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private static javax.swing.JTextField nameTxt;
    private static javax.swing.JTextField nicTxt;
    private javax.swing.JTextField secPswd;
    private static javax.swing.JTextField telephoneTxt;
    private javax.swing.JButton updateBtn1;
    private javax.swing.JButton updateDetailsBtn;
    // End of variables declaration//GEN-END:variables

}
