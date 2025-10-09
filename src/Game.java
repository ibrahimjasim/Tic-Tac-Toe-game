public class Game {
    private final Board board;
    private final Player player1;
    private final Player player2;

    private int p1wins = 0; // win counter for player 1
    private int p2wins = 0;// win counter for player 2

    // Constructor to set up a new game
    public Game(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() {
        player current = player1;

        while (true) {
            board.printBoard();
            System.out.println(current.getName() + "'s turn (" + current.getSymbol() + ")");
        }

    }
}
