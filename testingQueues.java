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
        Scanner keyboard = new Scanner(System.in);
        String input;
        System.out.println("Please enter a value:");
        input = keyboard.nextLine();
        System.out.println("test1");
        Node newNode = new Node(input);
        System.out.println("test2");
        myQueue.enqueue(newNode);
        System.out.println("test3");
            
        //myQueue.dequeue();
        System.out.println("test4");
        System.out.println(myQueue.getSize());
        System.out.println("test5");
        checkEmpty(myQueue);
    }
    private static void checkEmpty(Queue myQueue){
        if(myQueue.isEmpty()){
            System.out.println("Queue is empty");
        } else System.out.println("Queue is not empty");
    }
}
