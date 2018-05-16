import java.util.ArrayList;

/**
 * Created by Andrew on 16-May-18.
 */
public class Main {

    public static void main(String[] args){
        CSVWriter csv = new CSVWriter();
        ArrayList<String> serials = new ArrayList<>();
        String finishedCSV;

        serials.add("465456456");
        serials.add("654654");
        serials.add("654345");
        serials.add("132132132");
        serials.add("465654645456456");
        serials.add("6546456");
        serials.add("6546");


        finishedCSV = csv.csvWriter(serials);

        System.out.println(finishedCSV);

        csv.createCSV(finishedCSV);
    }
}
