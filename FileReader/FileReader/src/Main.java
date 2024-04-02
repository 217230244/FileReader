import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws Exception {
        String [] array = new String[4];
        String id;
        String itemName;
        String quantity;
        double price;
        //String temp = "";
        String separator = ",";
        double total = 0;

        String filePathForWindows = "C:\\Program Files\\Groceries.txt";
        String fileToWrite = "/Users/pram/Downloads/ABC.txt";

        FileReader fileReader = new FileReader(filePathForWindows);
        FileWriter fileWriter = new FileWriter(fileToWrite);

        BufferedReader reader = new BufferedReader(fileReader);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        String line;

        while((line = reader.readLine()) !=null){
            
            array = line.split(separator);

            price = Double.parseDoube(array[3]);

            total += price;

            System.out.println(line);
            writer.write(line);
            writer.newLine();
        }

        System.out.println("\n" + "Total price of groceries: " + Math.round(total));
        writer.write("\n" + "Total price of groceries: " + Math.round(total));

        reader.close();

        writer.flush();
        writer.close();

    }
}
