import java.io.IOException;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
/**
 * Contains functions that concern the file to contain account data
 *
 * @Sol Prebble
 * @25/4/26
 */
public class FileManager
{
    // instance variables - replace the example below with your own
    
    public static void writeStackToFile(String data){
        File stackData = new File("stackData.txt"); // create a new file where we will store information
        try{
            /* write to file */
            FileWriter writer = new FileWriter(stackData, false); // Create a new writer to edit the file. 'false' means it is not in append mode. So it rewrites the whole file.
            writer.write(data+"\n");
            
            /* clean up*/
            writer.flush();
            writer.close();
        }catch(IOException e){
            System.out.println("Error: could not write to file");
            e.printStackTrace();
        }
    }
    public static void readStackFile(String fileData){
        File bankFile = new File("stackData.txt");
        List<String> stackFromFile = new ArrayList<String>();
        try (Scanner fileReader = new Scanner(bankFile)){
            List<String> nonEmptyLines = Files.readAllLines(Paths.get("accountsData.txt")).stream()// https://codesignal.com/learn/courses/fundamentals-of-text-data-manipulation-in-java-1/lessons/reading-text-files-line-by-line-in-java
            .filter(line ->  !line.isBlank())
            .collect(Collectors.toList());
            for(String line : nonEmptyLines){
                stackFromFile.add(line);
            }
            System.out.println("File loaded");
        } catch (IOException e){
            System.out.println("Error, could not load file");
            e.printStackTrace();
        }
        
        /* This for loop, splits up the stackFromFile array into each induvidual pice of data in each line */
        for(int a = 0; a < stackFromFile.size(); a++){
            String[] data = stackFromFile.get(a).split(";");
            //System.out.println("length: "+data.length);
            
            /* Create a new account for each line */
            Stack stack = new Stack();
            stack.push(data[0]);
            fileData = String.valueOf(stack);
            //System.out.println("from file: "+Account.printAccounts());
        }
        System.out.println("Data: "+fileData);
        //System.out.println("Accounts arrayList: "+Account.accounts);
        //System.out.println("accountData: "+fileData);
    }
}