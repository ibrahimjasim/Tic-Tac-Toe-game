import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("🎮 Welcome to Tic-Tac-Toe!");

        // Always use default size 3
        int size = 3;
        System.out.println("Board size set to 3x3.");

        // Ask for player names
        System.out.println("Enter Player 1 name: ");
        String name1 = scanner.nextLine();

        // Aske if I want to play aginst com
        System.out.println("Play against computer? (y/n): ");
        String mode = scanner.nextLine().trim().toLowerCase();

        // Create players
        Player p1 = new HumanPlayer(name1, 'X', scanner);
        Player p2 ;

        if (mode.equals("y")) {
            p2 = new ComPlayer("computer", 'O');
        }else {
            System.out.println("Enter Player 2 name: ");
            String name2 = scanner.nextLine();
            p2 = new HumanPlayer(name2, 'O', scanner);
        }

        // Create board and start game
        Board board = new Board(size);
        Game game = new Game(board, p1, p2);
        game.start();

    }
}