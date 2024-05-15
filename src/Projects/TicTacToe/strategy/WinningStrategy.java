package Projects.TicTacToe.strategy;

import Projects.TicTacToe.models.Board;
import Projects.TicTacToe.models.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);

    void handelUndo(Board board, Move lastMove);
}
