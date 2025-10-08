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

    // Rest the game to start a new game(r: rest / c : chart
    public void reset() {
        for (int r = 0; r < size; r++) {
            for (int c = 0; c < size; c++) {
                grid[r][c] = EMPTY;
            }
        }
    }
    // Place a plyaer's symbol (X or O)
    public void placeSymbol(int row, int col, char symbol) {
        grid[row][col] = symbol;
    }

    // Check if a cell is empty
    public boolean checkSymbol(int row, int col) {
        return grid[row][col] == EMPTY;
    }

}
