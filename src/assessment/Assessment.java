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
import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Assessment {
        
        public String Subject;
        public String AssessmentID;
        public String AsssessmentType;
        public String topic;
        public String format;
        public String dueDate;
        public boolean graded;
        
        public Assessment() throws FileNotFoundException, IOException{
             CSVReader reader = new CSVReader(new FileReader("data.csv"));
            String [] nextLine;
            while ((nextLine = reader.readNext()) != null) {
            // nextLine[] is an array of values from the line
                 System.out.println(nextLine[0] + nextLine[1] + nextLine[2] + nextLine[3] + nextLine[4]);
                 Subject = nextLine[0];
                 AssessmentID = nextLine[1];
                 AsssessmentType = nextLine[2];
                 topic = nextLine[3];
                 format = nextLine[4];
                 dueDate = nextLine[5];
            }
        }
}
