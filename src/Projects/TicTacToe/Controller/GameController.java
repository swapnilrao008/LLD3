package Projects.TicTacToe.Controller;

import Projects.TicTacToe.exception.DuplicateSymbolForPlayer;
import Projects.TicTacToe.exception.MoreThanOneBotException;
import Projects.TicTacToe.exception.playersAndBotCountMissMatch;
import Projects.TicTacToe.models.Game;
import Projects.TicTacToe.models.Players;
import Projects.TicTacToe.strategy.WinningStrategy;

import java.util.List;

public class GameController {
    public Game createGame(int dimensions, List<Players> playersList, List<WinningStrategy> winningStrategyList) throws DuplicateSymbolForPlayer, MoreThanOneBotException, playersAndBotCountMissMatch {
        return Game.getBuilder().setPlayers(playersList).setDimension(dimensions)
                .setWinningStrategies(winningStrategyList)
                .build();
    }
    public void printBoard(Game game)
    {
        game.printBoard();
    }
    public void makeMove(Game game)
    {
        game.makeMove();
    }

    public void undo(Game game) {
        game.undo();
    }
}
