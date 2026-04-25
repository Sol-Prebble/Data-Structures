/**
 * This is the class for a 'stack' data structure
 * It takes user input of data and adds it to the set
 * It is a last in - last out data structure
 * It utilises the node class to create the stack
 */
public class Stack{
    private Node top;

    public Stack(){
        // Left empty
    }

    public boolean isEmpty(){
        return(this.top==null);
    }

    public void push(String data){
        Node node = new Node(); 
        node.setData(data);
        node.setNextNode(this.top); // current top becomes next node
        this.top = node; // this node becomes the new top
    }

    public String pop(){
        String data  = top.getData();
        top = top.getNextNode();
        return(data);
    }

    public Node getTop(){
        return(this.top);
    }

    public String seeTop(){
        String data = getTop().getData();
        return(data);
    }
}