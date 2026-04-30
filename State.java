/**
 * This is the enum class that contains all of the data structures that can be used by this program
 */
public enum State{
    HOMEPAGE("H"),
    STACK("S"),
    QUEUE("Q"),
    CLOSE("CLOSE");
    
    private final String alias;
    
    /**
     * Contructors
     */
    State(String alias){
        this.alias = alias;
    }
    /**
     * Constructor for constants WITHOUT an alias
     */
    State(){
        this.alias = null;
    }
    /** 
     * Static method to find enum by alias 
     */
    public static State fromAlias(String alias) {
        for (State s : values()) {
            if (alias.equalsIgnoreCase(s.alias)) return s;
        }
        return null;
    }
}