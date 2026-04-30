import java.util.Scanner;
/**
 * The Controller class contains all of the logic for the program
 */
public class Controller{
    Scanner keyboard = new Scanner(System.in);
    private State currentState;
    private Operation currentOperation;
    public Controller(){
        this.currentState = State.HOMEPAGE; // default state
    }
    /**
     * State setter
     */
    public void setState(){
        String rawInput = input();
        String processedInput = rawInput.toUpperCase().trim(); // trim whitespace
        State newState = State.fromAlias(processedInput);
        
        if(newState != null){
            this.currentState = newState;
            System.out.println("State set to: " + this.currentState);
        } else {
            System.out.println("invalid input, please try again");
        }
    }
    /**
     * Data Structure setter
     */
    public void setOperation(){
        Operation newOperation = Operation.fromAlias(input().toUpperCase());
        if(newOperation != null){
            this.currentOperation = newOperation;
        } else {
            System.out.println("invalid input, please try again");
        }
    }
    public void resetState(){
        this.currentState = State.HOMEPAGE;
    }
    /**
     * Main switch statement contained in here
     */
    public void run(){
        boolean runGame = true;
        while(runGame){
            switch(currentState){
                case HOMEPAGE -> homepage();
                case  STACK -> stack();
                case CLOSE -> runGame = false;
            }
        }
    }   
    public void homepage(){
        System.out.println("=================================\n Pick a data Structure to create \n=================================");
        System.out.println("[s] - New Stack");
        System.out.println("[q] - New Queue");
        System.out.println("[close] - Close the program");
        setState();
    }
    public void handleOperation(){
        System.out.println("What do you want to do?");
        System.out.println("[+] - push");
        System.out.println("[-] - pop");
        System.out.println("[=] - view");
        setOperation();
    }
    public void stack(){
        Stack stack = new Stack();
        handleOperation();
        switch(currentOperation){
            case PUSH -> stack.push(input());
            case POP -> stack.pop();
        }
        main.stackData += stack.seeTop();
        resetState();
    }
    public void queue(){
        
    }
    
    
    /**
     * asigns using input to a variable (String input)
     * Purely used to make other code easier to read
     */
    public String input(){
        String input = keyboard.nextLine();
        return(input);
    }
}