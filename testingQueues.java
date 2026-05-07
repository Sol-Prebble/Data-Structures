import java.util.Scanner;
/**
 * Write a description of class testingQueues here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class testingQueues
{
    public static void main(String[] args){
        Queue myQueue = new Queue();
        checkEmpty(myQueue);
        
        add(myQueue);
        add(myQueue);
        //myQueue.dequeue();
        //System.out.println(myQueue.getSize());
        //checkEmpty(myQueue);
        System.out.println(myQueue.getFullQueue());
    }
    private static void checkEmpty(Queue myQueue){
        if(myQueue.isEmpty()){
            System.out.println("Queue is empty");
        } else System.out.println("Queue is not empty");
    }
    private static void add(Queue myQueue){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the data:");
        String data;
        data = keyboard.nextLine();
        
        System.out.println("Please enter importance level 1-3:");
        int importance;
        importance = keyboard.nextInt();
        
        Node newNode = new Node(data, importance);
        myQueue.enqueue(newNode);
    }
}
