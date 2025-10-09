import java.util.Scanner;

public class HumanPlayer extends Player {

    private final Scanner scanner;


    public HumanPlayer(String name, char symbol, Scanner scanner) {
        super(name, symbol);
        this.scanner = scanner;
    }

    // Asks the user for their move and validates the input
    @Override
    public Move getMove(Board board) {
        while (true) {
            System.out.println(name +" (" + symbol + "), enter row and column ");
            String input = scanner.nextLine();
            String[] parts = input.trim().split(" ");

            // Must have exactly two numbers
            if (parts.length != 2) {
                System.out.println("❌ Please enter two numbers separated by space.");
                continue;
            }

            try {
                // Convert strings into integers
                int row = Integer.parseInt(parts[0]) -1;
                int col = Integer.parseInt(parts[1]) -1;

                // Check if inside the board range
                if (row >=0 && col >= 0 && row < board.getSize() && col < board.getSize() ) {
                    return new Move(row, col);
                }else {
                    System.out.println("❌ Out of range. Try again.");
                }
            }catch (NumberFormatException e) {
                System.out.println("❌ Invalid numbers. Try again.");
            }
        }
    }
}
