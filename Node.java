/**
 * This is the Node class
 * It creates objects for each data structure inside the project
 */
public class Node{
    private String data;
    private int importance;
    private Node next;

    /* Constructors */
    /* For a node with no data input */
    public Node(){
        this.data = "";
    }
    /* For a node with a string input */
    public Node(String data){
        this.data = data;
    }
    /* For a node with a string input */
    public Node(String data, int importance){
        this.data = data;
        this.importance = importance;
    }
    
    /* Getters */
    public String getData(){
        return(this.data);
    }
    public int getImportance(){
        return(this.importance);
    }
    public Node getNextNode(){
        return(this.next);
    }

    /* Setters */
    public void setData(String data){
        this.data = data;
    }
    public void setImportance(int importance){
        this.importance = importance;
    }
    public void setNextNode(Node n){
        this.next = n;
    }
}