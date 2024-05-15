package Projects.TicTacToe.strategy;

import Projects.TicTacToe.models.Board;
import Projects.TicTacToe.models.Cell;

public interface BotPlayingStrategy {
    Cell makeMove(Board board);
}
