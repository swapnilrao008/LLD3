package Projects.TicTacToe.models;


import Projects.TicTacToe.factories.BotPlayingStrageyFactory;
import Projects.TicTacToe.strategy.BotPlayingStrategy;

public class Bot extends Players{
    private DifficultyLevel difficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(Character symbol, String name, int id, PlayerType playerType,DifficultyLevel difficultyLevel) {
        super(symbol, name, id, playerType);
        this.difficultyLevel=difficultyLevel;
        this.botPlayingStrategy= BotPlayingStrageyFactory.getBotPlayingStrategy(difficultyLevel);
    }

    public DifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(DifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    @Override
    public Cell makeMove(Board board) {
        System.out.println("Bot is making the move.....");
        Cell cell = botPlayingStrategy.makeMove(board);
        cell.setCellState(CellState.FILLED);
        cell.setPlayers(this);
        return cell;
    }
}
