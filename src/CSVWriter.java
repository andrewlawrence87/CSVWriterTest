import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by Andrew on 16-May-18.
 */
public class CSVWriter {

    private String csvBody="";

    public String csvWriter(ArrayList<String> inputs){
        for(Iterator<String> it = inputs.iterator(); it.hasNext();){
            if (csvBody.isEmpty()){
                csvBody = ("'"+it.next()+"'");
            }
            else {csvBody += ("'"+it.next()+"'");}
            if(it.hasNext()){
                csvBody += (",");
            }
        }
        return csvBody;
    }


    public void createCSV(String serials){
        String fileLocation = "C:\\PracticeXML\\Serials.csv";
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(fileLocation));
            writer.write(serials);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }
        finally
        {
            try{
                if(writer!=null)
                    writer.close();
            }catch(Exception ex){
                System.out.println("Error in closing the BufferedWriter"+ex);
            }
        }
    }
}
