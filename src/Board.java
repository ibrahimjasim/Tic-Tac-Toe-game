public class Board {
    private final int size;
    private final char[][] grid;
    private static  final char EMPTY = ' ';


    // Constructor: create a new board of given size
    public Board(int size) {
        this.size = size;
        this.grid = new char[size][size];
        reset();
    }

    // Rest the game to start a new game
    public void reset() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                grid[i][j] = EMPTY;
            }
        }
    }
    // Check if a specific cell is empty
    public boolean isCellEmpty(int row, int col) {
        return grid[row][col] == EMPTY;
    }

    // Places a player's symbol (X or O) on the grid
    public void placeSymbol(int row, int col, char symbol) {
        grid[row][col] = symbol;
    }
    // Check if the board is full
    public boolean isFull() {
        for (int i =0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (grid[i][j] == EMPTY) return false;
            }
        }
        return true;
    }

    public boolean CheckWin(char symbol) {
        // Check all rows
        for (int i =0; i<size; i++){
            boolean rowWin = true;
            for (int j = 0; j<size; j++){
                if (grid[i][j] != symbol) rowWin = false;
            }
            if (rowWin) return true;


        }
        return false;
    }




}
