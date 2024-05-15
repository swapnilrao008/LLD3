package Projects.TicTacToe.models;

import Projects.TicTacToe.exception.DuplicateSymbolForPlayer;
import Projects.TicTacToe.exception.MoreThanOneBotException;
import Projects.TicTacToe.exception.playersAndBotCountMissMatch;
import Projects.TicTacToe.strategy.WinningStrategy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Game {
    private List<Players> playersList;
    private Board board;
    private Players winner;
    private GameState gameState;
    private int nextPlayerIndex;
    private List<Move> moves;
    private List<WinningStrategy> winningStrategies;

    private Game(List<Players> playersList,int dimensions,List<WinningStrategy> winningStrategies)
    {
        this.nextPlayerIndex=0;
        this.gameState=GameState.IN_PROG;
        this.moves=new ArrayList<>();
        this.board=new Board(dimensions);
        this.playersList = playersList;
        this.winningStrategies=winningStrategies;
    }

    public List<Players> getPlayersList() {
        return playersList;
    }

    public void setPlayersList(List<Players> playersList) {
        this.playersList = playersList;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public Players getWinner() {
        return winner;
    }

    public void setWinner(Players winner) {
        this.winner = winner;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }


    public static Builder getBuilder(){
        return new Builder();

    }

    public void printBoard() {
        board.printBoard();
    }

    public void makeMove() {
        Players players = playersList.get(nextPlayerIndex);
        Cell cell = players.makeMove(board);
        Move move=new Move(cell,players);
        moves.add(move);
        if(checkWinner(move,board)){
            gameState=GameState.CONCLUDED;
            winner=players;
            return;
        }
        if(moves.size()==board.getDimensions()*board.getDimensions())
        {
            gameState=GameState.DRAW;
            return;
        }
        nextPlayerIndex++;
        nextPlayerIndex=nextPlayerIndex%playersList.size();

    }

    private boolean checkWinner(Move move, Board board) {
        for(WinningStrategy winningStrategy:winningStrategies)
        {
            if(winningStrategy.checkWinner(board,move))
            {
                return true;
            }
        }
        return false;
    }

    public void undo() {
        if (moves.size()==0)
        {
            System.out.println("no moves to undo");
            return;
        }
        Move lastMove=moves.get(moves.size()-1);
        moves.remove(moves.size()-1);
        Cell cell=lastMove.getCell();
        cell.setCellState(CellState.EMPTY);
        cell.setPlayers(null);

        for(WinningStrategy winningStrategy:winningStrategies)
        {
            winningStrategy.handelUndo(board,lastMove);
        }

        if(nextPlayerIndex!=0) {
            nextPlayerIndex--;
        }
        else {
            nextPlayerIndex=playersList.size()-1;
        }


    }

    public static class Builder{
        private List<Players> players;
        private int dimension;
        private List<WinningStrategy> winningStrategies;

        public Builder setWinningStrategies(List<WinningStrategy> winningStrategies) {
            this.winningStrategies = winningStrategies;
            return this;
        }

        private Builder(){
            this.dimension=0;
            this.players=new ArrayList<>();
        }

        public Builder setPlayers(List<Players> players) {
            this.players = players;
            return this;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }
        public Game build() throws MoreThanOneBotException, playersAndBotCountMissMatch, DuplicateSymbolForPlayer {
            //add all validations here
            validateBotCount();
            validateDimensionAndPlayerCount();
            validateUniqueSymbolForEachPlayer();
            return new Game(players,dimension,winningStrategies);
        }

        private void validateUniqueSymbolForEachPlayer() throws DuplicateSymbolForPlayer {
            HashSet<Character> symbols = new HashSet<>();
            for (Players p:players)
            {
                if(symbols.contains(p.getSymbol()))
                {
                    throw new DuplicateSymbolForPlayer();
                }
                symbols.add(p.getSymbol());
            }
        }

        private void validateDimensionAndPlayerCount() throws playersAndBotCountMissMatch {
            if(players.size()!=dimension-1) {
                throw new playersAndBotCountMissMatch();
            }
        }

        private void validateBotCount() throws MoreThanOneBotException {
            int botCount=0;
            for (Players p:players)
            {
                if (p.getPlayerType().equals(PlayerType.BOT))
                {
                    botCount++;
                }
                if(botCount>1)
                {
                    throw new MoreThanOneBotException();
                }
            }
        }
    }
}
