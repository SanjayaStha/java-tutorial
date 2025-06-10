
import java.io.*;

public class FileReadWriter {


    public static void main(String[] args) {
        
        String filename = "/Users/sanjayashrestha/html/java/resources/random.txt";


        FileReadWriter frw = new FileReadWriter();
        

        frw.readFromFile(filename);

        // writeToAFile(filename, "dlkfjkldjf", true);


    }

    public void readFromFile(String filename){

        try {
            
            FileReader fr = new FileReader(filename);
            BufferedReader bf = new BufferedReader(fr);

            String line = bf.readLine();
            while (line != null) {
                System.out.println(line);
                line = bf.readLine();
            }

            fr.close();


        } catch (Exception e) {
            // TODO: handle exception
        }

    }


    public void writeToAFile(String filename, String content, boolean append ){

        try {
            FileWriter fw = new FileWriter(filename, append);
            fw.write(content);

            fw.flush(); // writes to file at once

            fw.close(); // close objects no longer needed

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }


    // public static void main(String[] args) {
    //     // String filePath = "example.txt";
    //     final String RESOURCE_PATH = "/Users/sanjayashrestha/html/java/resources/";
    //     final String FILE_NAME = "random.txt";

    //     FileReadWriter frw = new FileReadWriter();

    //     // 1. Write (Overwrite Mode)
    //     frw.writeToFile(RESOURCE_PATH+FILE_NAME, "This will overwrite existing content.\n", false);

    //     // 2. Write (Append Mode)
    //     frw.writeToFile(RESOURCE_PATH+FILE_NAME, "This line is appended.\n", true);
    //     frw.writeToFile(RESOURCE_PATH+FILE_NAME, "Another appended line.\n", true);

    //     // 3. Read file
    //     readFromFile(RESOURCE_PATH+FILE_NAME);
    // }

    // FileWriter: Overwrite or Append
    // public void writeToFile(String path, String content, boolean appendMode) {
    //     try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, appendMode)))
    //           {
    //         bw.write(content);
    //         // fw.write(content);

    //         System.out.println("Written to file: " + content.trim());
    //     } catch (IOException e) {
    //         System.err.println("Error writing to file: " + e.getMessage());
    //     }
    // }

    // // FileReader: Read content
    // public static void readFromFile(String path) {
    //     System.out.println("\nReading from file:");
    //     try (FileReader fr = new FileReader(path);
    //          BufferedReader br = new BufferedReader(fr)) {

    //         String line;
            
    //         // while (line != null) {
    //         //     System.out.println(line);
    //         //     line = br.readLine();
    //         // }

    //         while ((line = br.readLine()) != null) {
    //             System.out.println(line);
    //         }
            

    //     } catch (IOException e) {
    //         System.err.println("Error reading from file: " + e.getMessage());
    //     }
    // }
}
