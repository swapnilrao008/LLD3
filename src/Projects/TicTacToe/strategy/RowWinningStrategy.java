package Projects.TicTacToe.strategy;

import Projects.TicTacToe.models.Board;
import Projects.TicTacToe.models.Move;

import java.util.HashMap;
import java.util.Map;

public class RowWinningStrategy implements WinningStrategy{
    Map<Integer, Map<Character,Integer>> rowMaps=new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        int row=move.getCell().getRow();
        Character symbol=move.getPlayers().getSymbol();
        if(!rowMaps.containsKey(row))
        {
            rowMaps.put(row,new HashMap<>());
        }
        Map<Character,Integer> rowMap=rowMaps.get(row);
        if(!rowMap.containsKey(symbol))
        {
            rowMap.put(symbol,0);
        }
        rowMap.put(symbol,rowMap.get(symbol)+1);
        if(rowMap.get(symbol).equals(board.getDimensions()))
        {
            return true;
        }
        return false;


    }

    @Override
    public void handelUndo(Board board, Move lastMove) {
        int row = lastMove.getCell().getRow();
        Character symbol = lastMove.getPlayers().getSymbol();

        Map<Character, Integer> rowMap = rowMaps.get(row);
        rowMap.put(symbol,rowMap.get(symbol)-1);



    }
}
