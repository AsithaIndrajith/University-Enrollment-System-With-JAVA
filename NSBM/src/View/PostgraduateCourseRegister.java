/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import static Controller.CourseController.searchCourseName;
import static Controller.PostgraduateController.deletePostgraduate;
import static Controller.StudentSubjectController.insertStudentSubject;
import static Controller.SubjectController.searchOtherSubject;
import static Controller.SubjectController.searchSubject;
import Model.StudentSubject;
import static Model.StudentSubject.getTime;
import Model.Subject;
import static View.Home.hm;
import static View.PostgraduateLogin.pos;
import static View.PostgraduateRegister.posCs;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asitha
 */
public class PostgraduateCourseRegister extends javax.swing.JFrame {
    private static ArrayList<Subject>coreSub=new ArrayList<>();
    private static ArrayList<Subject>otherSub=new ArrayList<>();
    private static ArrayList<Integer>cost=new ArrayList<>();
    private static PostgraduatePayment posPay;
    private static int count=0;

    public static ArrayList<Subject> getCoreSub() {
        return coreSub;
    }

    public static void setCoreSub(ArrayList<Subject> aCoreSub) {
        coreSub = aCoreSub;
    }

    public static ArrayList<Subject> getOtherSub() {
        return otherSub;
    }

    public static void setOtherSub(ArrayList<Subject> aOtherSub) {
        otherSub = aOtherSub;
    }

    public static ArrayList<Integer> getCost() {
        return cost;
    }

    public static void setCost(ArrayList<Integer> aCost) {
        cost = aCost;
    }

    public static PostgraduatePayment getPosPay() {
        return posPay;
    }

    public static void setPosPay(PostgraduatePayment aPosPay) {
        posPay = aPosPay;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int aCount) {
        count = aCount;
    }
    
    /**
     * Creates new form PostgraduateCourseRegister
     */
    public PostgraduateCourseRegister() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        selectYear = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        selectCourse = new javax.swing.JComboBox<>();
        selectSemester = new javax.swing.JComboBox<>();
        refresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        subTable = new javax.swing.JTable();
        otherSub1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        otherSub2 = new javax.swing.JComboBox<>();
        otherSub3 = new javax.swing.JComboBox<>();
        proceedBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel8.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel8.setText("Select Year");

        selectYear.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        selectYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Year", "1", "2" }));

        jLabel9.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel9.setText("Select Semester");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel5.setText("Select Course");

        selectCourse.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        selectCourse.setPreferredSize(new java.awt.Dimension(50, 50));
        selectCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCourseActionPerformed(evt);
            }
        });

        selectSemester.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        selectSemester.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Semester", "1", "2" }));

        refresh.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        subTable.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        subTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Core Subject Code", "Core Subjects Name", "Semester", "Year"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        subTable.setGridColor(new java.awt.Color(255, 255, 255));
        subTable.setPreferredSize(new java.awt.Dimension(150, 64));
        jScrollPane1.setViewportView(subTable);

        otherSub1.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        otherSub1.setPreferredSize(new java.awt.Dimension(50, 50));
        otherSub1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherSub1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel2.setText("Select first subject");
        jLabel2.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel6.setText("Select second subject");
        jLabel6.setPreferredSize(new java.awt.Dimension(50, 50));

        jLabel7.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jLabel7.setText("Select third subject");
        jLabel7.setPreferredSize(new java.awt.Dimension(50, 50));

        otherSub2.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        otherSub2.setPreferredSize(new java.awt.Dimension(50, 50));
        otherSub2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherSub2ActionPerformed(evt);
            }
        });

        otherSub3.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        otherSub3.setPreferredSize(new java.awt.Dimension(50, 50));
        otherSub3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherSub3ActionPerformed(evt);
            }
        });

        proceedBtn.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        proceedBtn.setText("PROCEED");
        proceedBtn.setPreferredSize(new java.awt.Dimension(50, 50));
        proceedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedBtnActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Ubuntu", 0, 19)); // NOI18N
        jButton2.setText("CANCEL");
        jButton2.setPreferredSize(new java.awt.Dimension(50, 50));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1200, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(92, 92, 92)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(237, 237, 237)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(otherSub2, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(otherSub1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(otherSub3, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(proceedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(selectSemester, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(selectCourse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(selectYear, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel5)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9))
                    .addContainerGap(92, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(selectYear))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                        .addComponent(selectSemester, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(selectCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(otherSub1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(otherSub2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(otherSub3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(28, 28, 28)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(proceedBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(76, 76, 76)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCourseActionPerformed

    }//GEN-LAST:event_selectCourseActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:

        if(getSelectYear().getSelectedItem().equals("Select Year")){
            JOptionPane.showMessageDialog(rootPane, "Please select your academic year");
            
                    
        }
        if(getSelectSemester().getSelectedItem().equals("Select Semester")){
            JOptionPane.showMessageDialog(rootPane, "Please select academic semester");
            
        }
        if(getSelectCourse().getSelectedItem().equals("Select Course")){
            JOptionPane.showMessageDialog(rootPane, "Please select a course");
            
        }
        else{
            try {
            String yr=(String)getSelectYear().getSelectedItem();
            String sem=(String)getSelectSemester().getSelectedItem();
            String cs=(String)getSelectCourse().getSelectedItem();
            String deg=searchCourseName(cs);
            setCoreSub(searchSubject(deg,yr,sem));
            if(!coreSub.isEmpty()){
                DefaultTableModel dtm = (DefaultTableModel) getSubTable().getModel();
                dtm.setRowCount(0);
                for (Subject sub : getCoreSub()) {
                    Object[] rowData = {sub.getSubjectID(), sub.getSubjectName(),sub.getSubjectSemester(),sub.getSubjectYear()};
                    dtm.addRow(rowData);
                }
                setOtherSub(searchOtherSubject(deg,yr,sem));
                String otherSubName[]=new String[4];
                for(int i=0;i<4;i++){
                    otherSubName[i]=(String)(getOtherSub().get(i).getSubjectName());
                    getCost().add(Integer.parseInt(getOtherSub().get(i).getPrice()));
                }
                getOtherSub1().setModel(new DefaultComboBoxModel<>(otherSubName));
                getOtherSub2().setModel(new DefaultComboBoxModel<>(otherSubName));
                getOtherSub3().setModel(new DefaultComboBoxModel<>(otherSubName));

            }
            else{
                JOptionPane.showMessageDialog(rootPane, "There are no courses available for you.");
            }
        } catch (SQLException ex) {
            Logger.getLogger(UndergraduateCourseRegister.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UndergraduateCourseRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
    }//GEN-LAST:event_refreshActionPerformed

    private void otherSub1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherSub1ActionPerformed
        // TODO add your handling code here:
        if((getOtherSub2().getSelectedIndex()==getOtherSub1().getSelectedIndex())||(getOtherSub3().getSelectedIndex()==getOtherSub1().getSelectedIndex())){
            JOptionPane.showMessageDialog(rootPane, "Please select three different courses");
        }
    }//GEN-LAST:event_otherSub1ActionPerformed

    private void otherSub2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherSub2ActionPerformed
        // TODO add your handling code here:
        if((getOtherSub1().getSelectedIndex()==getOtherSub2().getSelectedIndex())||(getOtherSub3().getSelectedIndex()==getOtherSub2().getSelectedIndex())){
            JOptionPane.showMessageDialog(rootPane, "Please select three different courses");
        }
    }//GEN-LAST:event_otherSub2ActionPerformed

    private void otherSub3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherSub3ActionPerformed
        // TODO add your handling code here:
        if((getOtherSub2().getSelectedIndex()==getOtherSub3().getSelectedIndex())||(getOtherSub1().getSelectedIndex()==getOtherSub3().getSelectedIndex())){
            JOptionPane.showMessageDialog(rootPane, "Please select three different courses");
        }
    }//GEN-LAST:event_otherSub3ActionPerformed

    private void proceedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedBtnActionPerformed
        // TODO add your handling code here:

        if(((Integer.parseInt(getTime().substring(0,2))-1)*30+Integer.parseInt(getTime().substring(3,5)))>167&&((Integer.parseInt(getTime().substring(0,2))-1)*30+Integer.parseInt(getTime().substring(3,5)))<182){
            getSelectSemester().setSelectedIndex(2);
            getSelectSemester().setEditable(false);
            getSelectSemester().setEnabled(false);
            for(int i=0;i<4;i++){
                StudentSubject studentSubject=new StudentSubject();
                studentSubject.setStudentID(pos.getId());
                studentSubject.setSubjectID(getCoreSub().get(i).getSubjectID());
                try {
                    insertStudentSubject(studentSubject);
                } catch (SQLException ex) {
                    Logger.getLogger(UndergraduateCourseRegister.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(UndergraduateCourseRegister.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            int sub1=getOtherSub1().getSelectedIndex();
            int sub2=getOtherSub2().getSelectedIndex();
            int sub3=getOtherSub3().getSelectedIndex();

            StudentSubject studentSubject=new StudentSubject();
            studentSubject.setStudentID(pos.getId());
            studentSubject.setSubjectID(getOtherSub().get(sub1).getSubjectID());
            getCost().add(Integer.parseInt(getOtherSub().get(sub1).getPrice()));
            try {
                insertStudentSubject(studentSubject);
            } catch (SQLException ex) {
                Logger.getLogger(UndergraduateCourseRegister.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UndergraduateCourseRegister.class.getName()).log(Level.SEVERE, null, ex);
            }
            studentSubject.setStudentID(pos.getId());
            studentSubject.setSubjectID(getOtherSub().get(sub2).getSubjectID());
            getCost().add(Integer.parseInt(getOtherSub().get(sub2).getPrice()));
            try {
                insertStudentSubject(studentSubject);
            } catch (SQLException ex) {
                Logger.getLogger(UndergraduateCourseRegister.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UndergraduateCourseRegister.class.getName()).log(Level.SEVERE, null, ex);
            }
            studentSubject.setStudentID(pos.getId());
            studentSubject.setSubjectID(getOtherSub().get(sub3).getSubjectID());
            getCost().add(Integer.parseInt(getOtherSub().get(sub2).getPrice()));
            try {
                insertStudentSubject(studentSubject);
            } catch (SQLException ex) {
                Logger.getLogger(UndergraduateCourseRegister.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UndergraduateCourseRegister.class.getName()).log(Level.SEVERE, null, ex);
            }

            this.setVisible(false);
            setPosPay(new PostgraduatePayment());
            getPosPay().setVisible(true);
            int total=0;
                for(int i=0;i<getCost().size();i++){
                    total+=getCost().get(i);
                }
            getPosPay().getTotal().setText(Integer.toString(total));

        }
        else if(((Integer.parseInt(getTime().substring(0,2))-1)*30+Integer.parseInt(getTime().substring(3,5)))>15&&((Integer.parseInt(getTime().substring(0,2))-1)*30+Integer.parseInt(getTime().substring(3,5)))<32){
            if(getCount()>1){
                for(int i=0;i<4;i++){
                StudentSubject studentSubject=new StudentSubject();
                studentSubject.setStudentID(pos.getId());
                studentSubject.setSubjectID(getCoreSub().get(i).getSubjectID());
                try {
                    insertStudentSubject(studentSubject);
                } catch (SQLException ex) {
                    Logger.getLogger(UndergraduateCourseRegister.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(UndergraduateCourseRegister.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            int sub1=getOtherSub1().getSelectedIndex();
            int sub2=getOtherSub2().getSelectedIndex();
            int sub3=getOtherSub3().getSelectedIndex();

            StudentSubject studentSubject=new StudentSubject();
            studentSubject.setStudentID(pos.getId());
            studentSubject.setSubjectID(getOtherSub().get(sub1).getSubjectID());
                getCost().add(Integer.parseInt(getOtherSub().get(sub1).getPrice()));
            try {
                insertStudentSubject(studentSubject);
            } catch (SQLException ex) {
                Logger.getLogger(UndergraduateCourseRegister.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UndergraduateCourseRegister.class.getName()).log(Level.SEVERE, null, ex);
            }
            studentSubject.setStudentID(pos.getId());
            studentSubject.setSubjectID(getOtherSub().get(sub2).getSubjectID());
                getCost().add(Integer.parseInt(getOtherSub().get(sub2).getPrice()));
            try {
                insertStudentSubject(studentSubject);
            } catch (SQLException ex) {
                Logger.getLogger(UndergraduateCourseRegister.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UndergraduateCourseRegister.class.getName()).log(Level.SEVERE, null, ex);
            }
            studentSubject.setStudentID(pos.getId());
            studentSubject.setSubjectID(getOtherSub().get(sub3).getSubjectID());
                getCost().add(Integer.parseInt(getOtherSub().get(sub2).getPrice()));
            try {
                insertStudentSubject(studentSubject);
            } catch (SQLException ex) {
                Logger.getLogger(UndergraduateCourseRegister.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UndergraduateCourseRegister.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(rootPane, "Please select subjects for your 2nd semester");
                getSelectSemester().setSelectedIndex(2);
                getSelectYear().setSelectedIndex(1);
                getSelectCourse().setSelectedIndex(getSelectCourse().getSelectedIndex());

                getSelectCourse().setEditable(false);
                getSelectCourse().setEnabled(false);
                getSelectSemester().setEditable(false);
                getSelectSemester().setEnabled(false);
                getSelectYear().setEditable(false);
                getSelectYear().setEnabled(false);
            }
            else{
                this.setVisible(false);
                setPosPay(new PostgraduatePayment());
                getPosPay().setVisible(true);
                
                int total=0;
                for(int i=0;i<getCost().size();i++){
                    total+=getCost().get(i);
                }
                getPosPay().getTotal().setText(Integer.toString(total));
            
            }
            
        }
    }//GEN-LAST:event_proceedBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.setVisible(false);
        try {
            deletePostgraduate(pos);
            hm.setVisible(true);
            hm.setLocationRelativeTo(null);
        } catch (SQLException ex) {
            Logger.getLogger(UndergraduatePayment.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UndergraduatePayment.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(PostgraduateCourseRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PostgraduateCourseRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PostgraduateCourseRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PostgraduateCourseRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PostgraduateCourseRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> otherSub1;
    private javax.swing.JComboBox<String> otherSub2;
    private javax.swing.JComboBox<String> otherSub3;
    private javax.swing.JButton proceedBtn;
    private javax.swing.JButton refresh;
    private javax.swing.JComboBox<String> selectCourse;
    private javax.swing.JComboBox<String> selectSemester;
    private javax.swing.JComboBox<String> selectYear;
    private javax.swing.JTable subTable;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JComboBox<String> getSelectCourse() {
        return selectCourse;
    }

    public void setSelectCourse(javax.swing.JComboBox<String> selectCourse) {
        this.selectCourse = selectCourse;
    }

    public javax.swing.JButton getjButton2() {
        return jButton2;
    }

    public void setjButton2(javax.swing.JButton jButton2) {
        this.jButton2 = jButton2;
    }

    public javax.swing.JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(javax.swing.JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public javax.swing.JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(javax.swing.JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public javax.swing.JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(javax.swing.JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public javax.swing.JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(javax.swing.JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public javax.swing.JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(javax.swing.JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public javax.swing.JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(javax.swing.JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public javax.swing.JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(javax.swing.JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public javax.swing.JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(javax.swing.JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public javax.swing.JComboBox<String> getOtherSub1() {
        return otherSub1;
    }

    public void setOtherSub1(javax.swing.JComboBox<String> otherSub1) {
        this.otherSub1 = otherSub1;
    }

    public javax.swing.JComboBox<String> getOtherSub2() {
        return otherSub2;
    }

    public void setOtherSub2(javax.swing.JComboBox<String> otherSub2) {
        this.otherSub2 = otherSub2;
    }

    public javax.swing.JComboBox<String> getOtherSub3() {
        return otherSub3;
    }

    public void setOtherSub3(javax.swing.JComboBox<String> otherSub3) {
        this.otherSub3 = otherSub3;
    }

    public javax.swing.JButton getProceedBtn() {
        return proceedBtn;
    }

    public void setProceedBtn(javax.swing.JButton proceedBtn) {
        this.proceedBtn = proceedBtn;
    }

    public javax.swing.JButton getRefresh() {
        return refresh;
    }

    public void setRefresh(javax.swing.JButton refresh) {
        this.refresh = refresh;
    }

    public javax.swing.JComboBox<String> getSelectSemester() {
        return selectSemester;
    }

    public void setSelectSemester(javax.swing.JComboBox<String> selectSemester) {
        this.selectSemester = selectSemester;
    }

    public javax.swing.JComboBox<String> getSelectYear() {
        return selectYear;
    }

    public void setSelectYear(javax.swing.JComboBox<String> selectYear) {
        this.selectYear = selectYear;
    }

    public javax.swing.JTable getSubTable() {
        return subTable;
    }

    public void setSubTable(javax.swing.JTable subTable) {
        this.subTable = subTable;
    }
}
