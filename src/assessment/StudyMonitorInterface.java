/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.sun.xml.internal.txw2.Document;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.print.attribute.standard.SheetCollate;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
/**
 *
 * @author WhiteshadoW
 */

public class StudyMonitorInterface extends javax.swing.JFrame {
String [] populateAssess = null;

    /**
     * Creates new form StudyMonitorInterface
     */
    public StudyMonitorInterface() {
        initComponents();   // calling initComponent containing JFrame objects
        setVisible(true);   // making the JFrame shown
    }
    
    public void assessLoader() throws FileNotFoundException, IOException{
           
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        year = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        subjects = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        assessments = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        achivements = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextArea();
        create = new javax.swing.JButton();
        load = new javax.swing.JButton();
        assessment = new javax.swing.JButton();
        setgrade = new javax.swing.JButton();
        dispgrade = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Study Progress Monitor");

        jLabel2.setText("Student Name");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        jLabel3.setText("Year Level");

        year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearActionPerformed(evt);
            }
        });

        jLabel4.setText("Subjects");

        subjects.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select subject", "English", "Maths B", "Biology", "Business and Communication Technologies", "Religion and Ethics" }));
        subjects.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subjectsActionPerformed(evt);
            }
        });

        jLabel5.setText("Assessments");

        assessments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assessmentsActionPerformed(evt);
            }
        });

        jLabel6.setText("Achivements");

        achivements.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Choose Grade", "Emerging", "Developing", "Sound", "High", "Very High" }));
        achivements.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                achivementsActionPerformed(evt);
            }
        });

        jLabel7.setText("Student Performance");

        txtarea.setEditable(false);
        txtarea.setColumns(20);
        txtarea.setRows(5);
        jScrollPane1.setViewportView(txtarea);

        create.setText("Create Student");
        create.setEnabled(false);
        create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createActionPerformed(evt);
            }
        });

        load.setText("Load Assessment");
        load.setEnabled(false);
        load.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadActionPerformed(evt);
            }
        });

        assessment.setText("Display Assessment");
        assessment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assessmentActionPerformed(evt);
            }
        });

        setgrade.setText("Set Grade");
        setgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setgradeActionPerformed(evt);
            }
        });

        dispgrade.setText("Display Grade");
        dispgrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dispgradeActionPerformed(evt);
            }
        });

        clear.setText("Clear Display");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(assessments, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(subjects, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel5)
                                        .addGap(213, 213, 213)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(achivements, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(create)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(load)
                                .addGap(18, 18, 18)
                                .addComponent(assessment)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(setgrade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dispgrade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clear)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exit)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(subjects, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(achivements, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(assessments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(create)
                    .addComponent(load)
                    .addComponent(assessment)
                    .addComponent(setgrade)
                    .addComponent(dispgrade)
                    .addComponent(clear)
                    .addComponent(exit))
                .addGap(29, 29, 29))
        );

        //code for enabling the CreateStudent button if there's some key in both field
        //name.addKeyListener(new KeyAdapter() {
            //        public void keyReleased(KeyEvent e) { //watch for key strokes
                //            if(name.getText().length() == 0 || year.getText().length() == 0)
                //                create.setEnabled(false);   //disbale button if nothing is there
                //            else
                //            {
                    //                create.setEnabled(true);    //enable button if something is there
                    //            }
                //        }
            //     });
    //code for enabling the CreateStudent button if there's some key in both field
    //year.addKeyListener(new KeyAdapter() {
        //        public void keyReleased(KeyEvent e) { //watch for key strokes
            //            if(name.getText().length() == 0 || year.getText().length() == 0)
            //                create.setEnabled(false);   //disbale button if nothing is there
            //            else
            //            {
                //                create.setEnabled(true);    //enable button if something is there
                //            }
            //        }
        //     });

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

   
    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    
    private void yearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearActionPerformed
        // TODO add your handling code here:
        if(!name.getText().equals("")&&!year.getText().equals("")){
        
            
            //JOptionPane.showMessageDialog(null,"Object Created");
            create.setEnabled(true);
        }
    }//GEN-LAST:event_yearActionPerformed

    private void subjectsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subjectsActionPerformed
        // TODO add your handling code here:
    
        
        
    }//GEN-LAST:event_subjectsActionPerformed

    private void assessmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assessmentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_assessmentsActionPerformed

    private void achivementsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_achivementsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_achivementsActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        name.setText("");       // Sets the Student Name as blank
        year.setText("");       // Sets the Year Level as blank
        subjects.setSelectedIndex(0);       //Sets the Dropdown to original state
        assessments.removeAllItems();    //Sets the Dropdown to original state
        achivements.setSelectedIndex(0);    //Sets the Dropdown to original state
        txtarea.setText("");    // Sets the Student Performance textarea blank
    }//GEN-LAST:event_clearActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
        System.exit(0);     // Closes the program
    }//GEN-LAST:event_exitActionPerformed
    
    private void createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createActionPerformed
        // TODO add your handling code here:
        txtarea.setText("Student added to the System. You can now load Assessments using Load Assessment Button");
        load.setEnabled(true);  //Enables the Load Assessment button after the Create Student button is clicked
    }//GEN-LAST:event_createActionPerformed

    private void loadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loadActionPerformed
        // TODO add your handling code here:
//        String whatsubj = (String)subjects.getSelectedItem();
//        
//        try {
//            
//            Assessment assessObj = new Assessment();    //made object of assessment.java
//            String subname = assessObj.Subject;
//            if(whatsubj.equals(subname)){
//            String [] populateAssess = {assessObj.Subject, assessObj.AssessmentID, assessObj.AsssessmentType, assessObj.topic, assessObj.format, assessObj.dueDate};
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
        assessments.removeAllItems();
            CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader("data.csv"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(StudyMonitorInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        String [] nextLine;
        try {
        while ((nextLine = reader.readNext()) != null) {    //reads till the end of the file
            String whatsub = (String)subjects.getSelectedItem();
            if(whatsub.equals(nextLine[0])){    //checks which subject we want to get assessment of
                
                String sub = whatsub;
                switch(sub){
                case "English":
                    assessments.addItem(nextLine[1] + "," + nextLine[2] + "," + nextLine[3] + "," + nextLine[4] + "," + nextLine[5]);
                    break;
                case "Maths B":
                    assessments.addItem(nextLine[1] + "," + nextLine[2] + "," + nextLine[3] + "," + nextLine[4] + "," + nextLine[5]);
                    break;
                case "Religion and Ethics":
                    assessments.addItem(nextLine[1] + "," + nextLine[2] + "," + nextLine[3] + "," + nextLine[4] + "," + nextLine[5]);   
                    break;
                case "Biology":
                    assessments.addItem(nextLine[1] + "," + nextLine[2] + "," + nextLine[3] + "," + nextLine[4] + "," + nextLine[5]);
                    break;
                case "Business and Communication Technologies":
                    assessments.addItem(nextLine[1] + "," + nextLine[2] + "," + nextLine[3] + "," + nextLine[4] + "," + nextLine[5]);
                    break;
                default:
                    System.out.println("nothing found");
                    break;
                }
            } 
        }
        } catch (IOException ex) {
            Logger.getLogger(StudyMonitorInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_loadActionPerformed

    private void assessmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assessmentActionPerformed
        // TODO add your handling code here:
      txtarea.setText(""); // Reset the text area, to avoid appending multiples times the same values
      txtarea.append( (String) subjects.getSelectedItem() );
      ComboBoxModel model = assessments.getModel();    //need to change value to load assessment here
      int size = model.getSize();
                for(int i=1;i<size;i++) {
                    Object element = model.getElementAt(i);
                    txtarea.append(String.valueOf("\n"+element));
                }
    }//GEN-LAST:event_assessmentActionPerformed

    private void dispgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dispgradeActionPerformed
        // TODO add your handling code here:
        txtarea.setText(""); // Reset the text area, to avoid appending multiples times the same values
        txtarea.append( (String) subjects.getSelectedItem() );
        txtarea.append((String) assessments.getSelectedItem());
        txtarea.append("\n");
        String achive = ((String) achivements.getSelectedItem());
        if(achive.equals("Very high")){
            txtarea.append("Achievement: very high \n");
            txtarea.append("Knowledge: thorough understanding \n");
            txtarea.append("Skill: uses a high level of skill in both familiar and new situations \n");
        }
        if(achive.equals("High")){
            txtarea.append("Achievement: high \n");
            txtarea.append("Knowledge: clear understanding \n");
            txtarea.append("Skill: uses a high level of skill in both familiar and new situations, and is beginning to use skills in new situations \n");
        }
        if(achive.equals("Sound")){
            txtarea.append("Achievement: sound \n");
            txtarea.append("Knowledge: understanding \n");
            txtarea.append("Skill: uses a skills familiar to them \n");
        }
        if(achive.equals("Developing")){
            txtarea.append("Achievement: developing \n");
            txtarea.append("Knowledge: understanding aspects of \n");
            txtarea.append("Skill: uses varying levels of skill in situations familiar to them \n");
        }
        if(achive.equals("Emerging")){
            txtarea.append("Achievement: emerging \n");
            txtarea.append("Knowledge: basic understanding \n");
            txtarea.append("Skill: beginning to use skills in familiar situations \n");
        }
    }//GEN-LAST:event_dispgradeActionPerformed

    private void setgradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_setgradeActionPerformed
        // TODO add your handling code here:
        CSVWriter writer;
        CSVReader reader = null;
        
        try{
            reader = new CSVReader(new FileReader("data.csv"));
        }catch(Exception e){System.out.println(e);}
        
        String [] nextLine;
        try {
        while ((nextLine = reader.readNext()) != null) {
            String subject, id, type, topic, format, due;
            subject = nextLine[0];
            id = nextLine[1];
            type = nextLine[2];
            topic = nextLine[3];
            format = nextLine[4];
            due = nextLine[5];
            
            //to writing file
                writer = new CSVWriter(new FileWriter("Graded.csv"));
                String[] row = new String[]{subject, id, type, topic, format, due, (String) achivements.getSelectedItem()};
                writer.writeNext(row);
                writer.close();
        }
    } catch (IOException ex) {
        Logger.getLogger(StudyMonitorInterface.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    }//GEN-LAST:event_setgradeActionPerformed
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        new StudyMonitorInterface();    //Call for the constructor
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox achivements;
    private javax.swing.JButton assessment;
    private javax.swing.JComboBox assessments;
    private javax.swing.JButton clear;
    private javax.swing.JButton create;
    private javax.swing.JButton dispgrade;
    private javax.swing.JButton exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton load;
    public javax.swing.JTextField name;
    private javax.swing.JButton setgrade;
    private javax.swing.JComboBox subjects;
    private javax.swing.JTextArea txtarea;
    public javax.swing.JTextField year;
    // End of variables declaration//GEN-END:variables
}
