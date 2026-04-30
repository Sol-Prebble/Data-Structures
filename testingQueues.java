
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
        
        Node newNode = new Node();
        myQueue.enqueue(newNode);
        
        checkEmpty(myQueue);
    }
    private static void checkEmpty(Queue myQueue){
        if(myQueue.isEmpty()){
            System.out.println("Queue is empty");
        } else System.out.println("Queue is not empty");
    }
}
