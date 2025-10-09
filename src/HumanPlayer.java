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
        }
    }
}
