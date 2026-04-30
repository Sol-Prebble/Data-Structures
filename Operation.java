/**
 * This is the enum class that contains all of the possible states to be used by the Controller class
 */
public enum Operation{
    PUSH("+"),
    POP("-"),
    VIEW("="),
    RETURN("x");
    
    private final String alias;
    
    /**
     * Contructors
     */
    Operation(String alias){
        this.alias = alias;
    }
    /**
     * Constructor for constants WITHOUT an alias
     */
    Operation(){
        this.alias = null;
    }
    // Static method to find enum by alias
    public static Operation fromAlias(String alias) {
        for (Operation s : values()) {
                if (alias.equalsIgnoreCase(alias)) return(s);
        }
        return(null);
    }
}