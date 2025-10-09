import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComPlayer extends Player {

    // Computer player that picks random empty spots
    private final Random random = new Random();

    public ComPlayer(String name, char symbol) {
        super(name, symbol);
    }

    // Decide where the Com will move
    @Override
    public Move getMove(Board board) {
        int size = board.getSize();

        // step 1: try to win if possible
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if(board.isCellEmpty(i, j)){
                    board.placeSymbol(i, j, symbol);


                    // Check if this move would win the game
                    if (board.checkWin(symbol)) {
                        board.placeSymbol(i, j, ' ');
                        System.out.println(name + "(" +  symbol + ") Plays to WIN" + " " + (j+1));
                        return new Move(i, j);
                    }

                    // Undo the move if not a win
                    board.placeSymbol(i, j, ' ');
                }
            }
        }


        // Pick one random move from the list
        Move move = emptyCells.get(random.nextInt(emptyCells.size()));
        System.out.println(name + "(" + symbol + ") choose: " + (move.row + 1) + " " + (move.col+1));
        return move;
    }


}
