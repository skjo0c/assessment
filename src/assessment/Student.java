/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment;

import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel; 
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author WhiteshadoW
 */
public class Student {
    static ComboBoxModel getSubjectList;
    
   public Student(String sname, String syear){
       StudyMonitorInterface values = new StudyMonitorInterface();
       
       sname = values.name.getText();
       syear = values.year.getText();
    }
   public ArrayList getSubjectList(){
       ArrayList subjs = new ArrayList();
       subjs.add("English");
       subjs.add("Mathematics B");
       subjs.add("Biology");
       subjs.add("Businness and Communication Technologies");
       subjs.add("Religion and Ethics");
       return subjs;
   }
   
}
   
