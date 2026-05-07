
/**
 * This is the class for a 'queue' data structure
 * It takes user input of data and adds it to the set
 * It is a first in - first out data structure
 * It utilises the node class to create the queue
 */
public class Queue{
    private Node head = null;
    private Node tail = null;
    
    public Queue(){
        // Left empty
    }
    private void checkEmpty(Queue myQueue){
        if(isEmpty()){
            System.out.println("Queue is empty");
        } else System.out.println("Queue is not empty");
    }
    public boolean isEmpty(){
        return(this.head==null);
    }
    public int getSize(){
        int sizeCount = 0;
        Queue temp = this;
        while(!temp.isEmpty()){
            System.out.println(sizeCount);
            sizeCount++;
            temp.dequeue();
            System.out.println(sizeCount);
        }
        return(sizeCount);
    }
    public void enqueue(Node newNode){
        if(isEmpty()){
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            this.tail.setNextNode(newNode);
            this.tail = newNode;
        }
    }
    public Node dequeue(){
        if(isEmpty()){
            return(null);
        } else {
            Node temp = this.head;
            this.head = temp.getNextNode();
            System.out.println("dequeue method temp: "+temp.getData());
            return temp;
        }
    }
}
