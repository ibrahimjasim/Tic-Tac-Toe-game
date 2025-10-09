import java.util.Scanner;

public class Game {

        private final Board board; // The playing board
        private final Player player1;
        private final Player player2;
        private int p1Wins = 0; // Win counter for player 1
        private int p2Wins = 0; // Win counter for player 2
        private final Scanner scanner =  new Scanner(System.in);

    // Constructor to set up a new game
    public Game(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
    }
     // Starts the main game loop
    public void start() {
        Player current = player1;

        // Infinite loop: the game restarts automatically after each win or draw
        while (true) {
            board.printBoard();
            System.out.println(current.getName() + "'s turn (" + current.getSymbol() + ")");

            // Ask current player for their move
            Move move = current.getMove(board);

            // If the cell is already used, ask again
            if(!board.isCellEmpty(move.row, move.col)) {
                System.out.println("❌ Cell already taken. Try again!");
                continue;
            }

            // Place the player's symbol on the board
            board.placeSymbol(move.row, move.col, current.getSymbol());

            // Check for a win
            if (board.checkWin(current.getSymbol())) {
                board.printBoard();
                System.out.println("🎉 " + current.getName() + " wins!");
                if (current == player1) p1Wins++; else p2Wins++;
                printScore();

                // Ask if user wants to play again
                if(!askToContinue()) break;
                board.reset();
                current = player1;
                continue;
            }

            // Check for draw (board full and no winner)
            if (board.isFull()) {
                board.printBoard();
                System.out.println("🤝 It's a draw!");
                printScore();
                board.reset();
                current = player1;
                continue;
            }

            // Switch to the other player
            current = (current == player1) ? player2 : player1;
        }
        System.out.println("👋 Thanks for playing Tic-Tac-Toe!");
    }

    // Prints the total number of wins for each player
    private void printScore() {
        System.out.println("🏆 Score → " + player1.getName() + ": " + p1Wins + " | " + player2.getName() + ": " + p2Wins);
    }

     //  Ask user if they want to continue playing
     private boolean askToContinue() {
         while (true) {
             System.out.print("Do you want to play again? (y/n): ");
             String answer = scanner.nextLine().trim().toLowerCase();
             if (answer.equals("y")) {
                 System.out.println("🔄 Starting a new round...");
                 return true;
             } else if (answer.equals("n")) {
                 return false;
             } else 
                 System.out.println("❌ Please enter 'y' or 'n'.");
        }
     }
}
