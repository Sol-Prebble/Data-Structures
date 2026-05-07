
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
    public int getSize(){
        int sizeCount = 0;
        Queue temp = new Queue();
        temp = this;
        while(!temp.isEmpty()){
            sizeCount++;
            temp.dequeue();
            //System.out.println(sizeCount);
        }
        return(sizeCount);
    }
    public String getFullQueue(){
        Queue temp = new Queue();
        temp = this;
        String queueData = "[";
        System.out.println(temp.head.getData());
        while(!temp.isEmpty()){
            queueData += temp.head.getData();
            temp.dequeue();
            queueData += ", ";
        }
        queueData += "]";
        return(queueData);
    }
    public void enqueue(Node newNode){
        if(isEmpty()){
            this.head = newNode;
            this.tail = newNode;
        }
        else{
            Queue temp = this;
            System.out.println("newNode importance: "+newNode.getImportance());
            System.out.println("temp importance: "+temp.head.getImportance());
            while(newNode.getImportance() != temp.head.getImportance()){
                temp.head = temp.head.getNextNode();
            }
            System.out.println("success "+temp.head.getData());
            this.tail.setNextNode(newNode);
            this.tail = newNode;
        }
    }
    public Node dequeue(){
        if(isEmpty()){
            return(null);
        } else {
            Node node = this.head;
            this.head = node.getNextNode();
            System.out.println("dequeue method node: "+node.getData());
            return node;
        }
    }
}
