import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComPlayer extends Player {

    // Computer player that picks random empty spots
    private final Random random = new Random();

    public ComPlayer(String name, char symbol) {
        super(name, symbol);
    }

    // Chooses a random empty cell on the board
    @Override
    public Move getMove(Board board) {
        List<Move> emptyCells = new ArrayList<>();

        // Find all empty cells
        for (int i = 0; i < board.getSize(); i++) {
            for (int j = 0; j < board.getSize(); j++) {
                if(board.isCellEmpty(i, j)){
                    emptyCells.add(new Move(i, j));
                }
            }
        }

        // Pick one random move from the list
        Move move = emptyCells.get(random.nextInt(emptyCells.size()));
        System.out.println(name + "(" + symbol + ") choose: " + (move.row + 1) + " " + (move.col+1));
        return move;
    }


}
