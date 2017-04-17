/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assessment;

/**
 *
 * @author WhiteshadoW
 */
public class Student {
    
   public Student(String sname, String syear){
       StudyMonitorInterface values = new StudyMonitorInterface();
       
       sname = values.name.getText();
       syear = values.year.getText();
   } 
}
