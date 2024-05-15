package Projects.TicTacToe.factories;

import Projects.TicTacToe.models.DifficultyLevel;
import Projects.TicTacToe.strategy.BotPlayingStrategy;
import Projects.TicTacToe.strategy.EasyBotPlayingStrategy;

public class BotPlayingStrageyFactory {

    public static BotPlayingStrategy getBotPlayingStrategy(DifficultyLevel difficultyLevel) {
        return new EasyBotPlayingStrategy();
    }
}
