package Projects.TicTacToe.strategy;

import Projects.TicTacToe.models.Board;
import Projects.TicTacToe.models.Move;

import java.util.HashMap;
import java.util.Map;

public class ColumnWinningStrategy implements WinningStrategy{
    Map<Integer, Map<Character,Integer>> colMaps=new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        int col=move.getCell().getCol();
        Character symbol=move.getPlayers().getSymbol();
        if(!colMaps.containsKey(col))
        {
            colMaps.put(col,new HashMap<>());
        }
        Map<Character,Integer> colMap=colMaps.get(col);
        if(!colMap.containsKey(symbol))
        {
            colMap.put(symbol,0);
        }
        colMap.put(symbol,colMap.get(symbol)+1);
        if(colMap.get(symbol).equals(board.getDimensions()))
        {
            return true;
        }
        return false;


    }

    @Override
    public void handelUndo(Board board, Move lastMove) {
        int col = lastMove.getCell().getCol();
        Character symbol = lastMove.getPlayers().getSymbol();
        Map<Character, Integer> colMap = colMaps.get(col);
        colMap.put(symbol,colMap.get(symbol)-1);
    }
}

