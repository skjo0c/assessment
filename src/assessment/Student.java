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
public class Student extends StudyMonitorInterface{
    private String stname;
    private String styear;
    
   public Student(String name, String year, String createsub){
       
       this.stname = name;
       this.styear = year;
       
       ArrayList subjs = new ArrayList();
       subjs.add(createsub);
    }
   
}

   
