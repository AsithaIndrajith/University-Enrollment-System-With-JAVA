/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import static Controller.ExamGradeController.searchExamGradeByStudentID;
import static Controller.UndergraduateController.deleteUndergraduate;
import static Controller.UndergraduateController.searchUndergraduateByDepartmentID;
import static Controller.UndergraduateController.searchUndergraduateByStudentID;
import static Controller.UndergraduateController.updateUndergraduateAll;
import Model.ExamGrades;
import Model.Undergraduate;
import static View.AdministratorHome.unG;
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
public class AdministratorUndergraduateUpdate extends javax.swing.JFrame {

    /**
     * Creates new form AdministratorUndergraduateAdd
     */
    public AdministratorUndergraduateUpdate() {
        initComponents();
        this.loadUdergraduate();
        this.searchSpecialStudents();
    }
    void loadUdergraduate(){
        
        try {
            ArrayList<Undergraduate> unList=searchUndergraduateByDepartmentID(depid);
            DefaultTableModel dtm = (DefaultTableModel)undergraduateTable.getModel();
            dtm.setRowCount(0);
            for (Undergraduate un : unList) {
                Object[] rowData = {un.getId(),un.getName(),un.getNic(),un.getAddress(),un.getDob(),un.getTelephone(),un.getAlStream(),un.getAlResult()};
                dtm.addRow(rowData);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdministratorInstructorUpdate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdministratorInstructorUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    void searchSpecialStudents(){
        try {
            ArrayList<Undergraduate>undergraduate=searchUndergraduateByDepartmentID(depid);
            ArrayList<ExamGrades>examResultsOfStudent;
            DefaultTableModel dtm = (DefaultTableModel)specialYearStudents.getModel();
            dtm.setRowCount(0);
            
            for(Undergraduate un:undergraduate){
                examResultsOfStudent=searchExamGradeByStudentID(un.getId());
                ArrayList<String>resultStringList=new ArrayList<>();
                for(ExamGrades examResult:examResultsOfStudent){
                    resultStringList.add(examResult.getResult());
                }
                double gpa=calGPA(resultStringList);
                Object[] rowData = {un.getId(),Double.toString(gpa),gpa>=3.5?"Selected":"Not Selected"};
                dtm.addRow(rowData);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AdministratorUndergraduateUpdate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdministratorUndergraduateUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**calculate GPA*/
    double calGPA(ArrayList<String> resultArray){
        double gpa=0;
        for(String result:resultArray){
            if(AdministratorExamUpdate.grade(result)=="A+"){
                gpa+=5.5;
            }
            else if(AdministratorExamUpdate.grade(result)=="A"){
                gpa+=5;
            }
            else if(AdministratorExamUpdate.grade(result)=="A-"){
                gpa+=4.5;
            }
            else if(AdministratorExamUpdate.grade(result)=="B+"){
                gpa+=4;
            }
            else if(AdministratorExamUpdate.grade(result)=="B"){
                gpa+=3.5;
            }
            else if(AdministratorExamUpdate.grade(result)=="B-"){
                gpa+=3;
            }
            else if(AdministratorExamUpdate.grade(result)=="C+"){
                gpa+=2.5;
            }
            else if(AdministratorExamUpdate.grade(result)=="C"){
                gpa+=2;
            }
            else if(AdministratorExamUpdate.grade(result)=="C-"){
                gpa+=1.5;
            }
            else if(AdministratorExamUpdate.grade(result)=="D+"){
                gpa+=1;
            }
            else if(AdministratorExamUpdate.grade(result)=="D"){
                gpa+=0.5;
            }
            else{
                gpa+=0;
            }
        }
        return gpa/resultArray.size();
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
        jLabel2 = new javax.swing.JLabel();
        nameTxt = new javax.swing.JTextField();
        nicTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        addressTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        telephoneTxt = new javax.swing.JTextField();
        indexTxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nextBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        studID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        dobTxt = new javax.swing.JTextField();
        eduTxt = new javax.swing.JTextField();
        alStreamTxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        pswdTxt = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        undergraduateTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        specialYearStudents = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Administrator Undergraduate Management Panel");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel2.setText("Name");

        nameTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        nicTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel3.setText("National Identity Card Number");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel5.setText("Date Of Birth");

        addressTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel6.setText("Address");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel4.setText("Telephone");

        telephoneTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        indexTxt.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel1.setText("Education Qualifications Advance Level");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel7.setText("Examination Index Number Advance Level");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel8.setText("Advance Level Stream");

        nextBtn.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        nextBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/update1.png"))); // NOI18N
        nextBtn.setText("Update");
        nextBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        nextBtn.setMaximumSize(new java.awt.Dimension(250, 50));
        nextBtn.setPreferredSize(new java.awt.Dimension(250, 50));
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel9.setText("Enter Student ID");

        jButton1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/search1.png"))); // NOI18N
        jButton1.setText("Find Student");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setPreferredSize(new java.awt.Dimension(250, 50));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel10.setText("Passowrd");

        jButton2.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/deleteBtn1.png"))); // NOI18N
        jButton2.setText("Delete");
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.setMaximumSize(new java.awt.Dimension(250, 50));
        jButton2.setPreferredSize(new java.awt.Dimension(250, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(0, 153, 153));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setOpaque(true);

        jButton3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close5.png"))); // NOI18N
        jButton3.setText("Close");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.setMaximumSize(new java.awt.Dimension(250, 50));
        jButton3.setPreferredSize(new java.awt.Dimension(250, 50));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/settings.png"))); // NOI18N
        jLabel12.setText("Undergraduate Student Management Panel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(telephoneTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(addressTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eduTxt)
                                    .addComponent(alStreamTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(148, 148, 148))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3)))
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nicTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dobTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                                    .addComponent(studID, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(44, 44, 44))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(326, 326, 326)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pswdTxt)
                                    .addComponent(indexTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nextBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studID, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nicTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dobTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telephoneTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eduTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alStreamTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(indexTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pswdTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(nextBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Undergraduate Details", jPanel1);

        undergraduateTable.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        undergraduateTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Student Name", "NIC", "Address", "Date Of Birth", "Telephone", "A/L Stream", "A/L Results"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(undergraduateTable);

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

        jTabbedPane1.addTab("Student View", jPanel2);

        specialYearStudents.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "GPA", "Selected/Not Selected"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(specialYearStudents);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1195, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 870, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Special Year Selected List", jPanel3);

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

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        String name=nameTxt.getText();
        String nic=nicTxt.getText();
        String dob=dobTxt.getText();
        String address=addressTxt.getText();
        String telephone=telephoneTxt.getText();
        String alResult=(String)eduTxt.getText();
        String alIndex=indexTxt.getText();
        String alStream=alStreamTxt.getText();
        String pswd=pswdTxt.getText();
        unG.setName(name);
        unG.setNic(nic);
        unG.setDob(dob);
        unG.setAddress(address);
        unG.setTelephone(telephone);
        unG.setAlResult(alResult);
        unG.setAlIndex(alIndex);
        unG.setAlStream(alStream);
        unG.setPassword(pswd);
        unG.setDepID(depid);
        try {
            int res=updateUndergraduateAll(unG);
            if(res>0){
                JOptionPane.showMessageDialog(rootPane, "Update successfull!!!");
                this.loadUdergraduate();
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Your details are wrong.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UndergraduateRegister.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UndergraduateRegister.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Try again later!!!");
        }
    }//GEN-LAST:event_nextBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String id=studID.getText();
        try {
            unG=searchUndergraduateByStudentID(id);
            if(unG==null){
                JOptionPane.showMessageDialog(rootPane, "Student record does not exist!!!");
            }
            else{
                nameTxt.setText(unG.getName());
                telephoneTxt.setText(unG.getTelephone());
                addressTxt.setText(unG.getAddress());
                nicTxt.setText(unG.getNic());
                dobTxt.setText(unG.getDob());
                eduTxt.setText(unG.getAlResult());
                alStreamTxt.setText(unG.getAlStream());
                indexTxt.setText(unG.getAlIndex());
                pswdTxt.setText(unG.getPassword());
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdministratorUndergraduateUpdate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdministratorUndergraduateUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Try again later!!!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            // TODO add your handling code here:
            if(deleteUndergraduate(unG)>0){
                JOptionPane.showMessageDialog(rootPane,"Student record deleted successfully!!!");
                this.loadUdergraduate();
            }
                } catch (SQLException ex) {
            Logger.getLogger(AdministratorUndergraduateUpdate.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdministratorUndergraduateUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Try again later!!!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        administratorHome.setVisible(true);
        administratorHome.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(AdministratorUndergraduateUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministratorUndergraduateUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministratorUndergraduateUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministratorUndergraduateUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministratorUndergraduateUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTxt;
    private javax.swing.JTextField alStreamTxt;
    private javax.swing.JTextField dobTxt;
    private javax.swing.JTextField eduTxt;
    private javax.swing.JTextField indexTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nameTxt;
    private javax.swing.JButton nextBtn;
    private javax.swing.JTextField nicTxt;
    private javax.swing.JPasswordField pswdTxt;
    private javax.swing.JTable specialYearStudents;
    private javax.swing.JTextField studID;
    private javax.swing.JTextField telephoneTxt;
    private javax.swing.JTable undergraduateTable;
    // End of variables declaration//GEN-END:variables
}
