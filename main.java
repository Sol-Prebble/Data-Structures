/**
 * This is the main class
 */
public class main{
    public static String stackData = "";
    public static void main (String[] args){
        Controller main = new Controller();
        main.run();
        System.out.println(stackData);
        FileManager.writeStackToFile(stackData);
    }
}
