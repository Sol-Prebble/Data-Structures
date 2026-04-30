
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

    public boolean isEmpty(){
        return(this.head==null);
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
}
