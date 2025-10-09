//Abstract base class for both human and computer players

public abstract class Player {
    protected final String name;   // The player's name
    protected final char symbol;   // The player's symbol (X or O)

    // Constructor: sets the name and symbol
    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    // Returns the player's name
    public String getName() {
        return name;
    }

    // Returns the player's symbol
    public char getSymbol() {
        return symbol;
    }

    //  method: each type of player decides its own move
    public abstract Move getMove(Board board);
}

