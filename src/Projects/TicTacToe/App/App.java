package Projects.TicTacToe.App;

import Projects.TicTacToe.Controller.GameController;
import Projects.TicTacToe.exception.DuplicateSymbolForPlayer;
import Projects.TicTacToe.exception.MoreThanOneBotException;
import Projects.TicTacToe.exception.playersAndBotCountMissMatch;
import Projects.TicTacToe.models.*;
import Projects.TicTacToe.strategy.ColumnWinningStrategy;
import Projects.TicTacToe.strategy.DiagonalWinningStrategy;
import Projects.TicTacToe.strategy.RowWinningStrategy;
import Projects.TicTacToe.strategy.WinningStrategy;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws DuplicateSymbolForPlayer, MoreThanOneBotException, playersAndBotCountMissMatch {
        GameController gameController = new GameController();
        int dimension=3;
        Scanner sc=new Scanner(System.in);
        ArrayList<Players> players=new ArrayList<>();
        players.add(new HumanPlayer('x',"swap",1, PlayerType.HUMAN,sc));
        players.add(new Bot('0',"bala",2,PlayerType.BOT, DifficultyLevel.EASY));
        ArrayList<WinningStrategy> winningStrategies = new ArrayList<>();
        winningStrategies.add(new DiagonalWinningStrategy());
        winningStrategies.add(new RowWinningStrategy());
        winningStrategies.add(new ColumnWinningStrategy());

        Game game=gameController.createGame(dimension,players,winningStrategies);
        while(GameState.IN_PROG.equals(game.getGameState())) {
            gameController.printBoard(game);

            System.out.println("please select yes or no for undo the prev move");
            String undo=sc.next();
            if(undo.equalsIgnoreCase("Y"))
            {
                gameController.undo(game);
                continue;
            }
            gameController.makeMove(game);
        }
        if (GameState.CONCLUDED.equals(game.getGameState()))
        {
            System.out.println(game.getWinner().getName()+" has won the game");
        }
        if(GameState.DRAW.equals(game.getGameState()))
        {
            System.out.println("its a draw");
        }
    }
}
