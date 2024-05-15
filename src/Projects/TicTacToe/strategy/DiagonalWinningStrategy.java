package Projects.TicTacToe.strategy;

import Projects.TicTacToe.models.Board;
import Projects.TicTacToe.models.Move;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStrategy implements WinningStrategy{

    Map<Character,Integer> leftDiagMap=new HashMap<>();
    Map<Character,Integer> rightDiagMap=new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move move) {
        int row=move.getCell().getRow();
        int col=move.getCell().getCol();
        Character symbol=move.getPlayers().getSymbol();
        //for left digonal
        if(row==col)
        {
            if(!leftDiagMap.containsKey(symbol))
            {
                leftDiagMap.put(symbol,0);
            }
            leftDiagMap.put(symbol,leftDiagMap.get(symbol)+1);
            if(leftDiagMap.get(symbol).equals(board.getDimensions()))
            {
                return true;
            }

        }
        //for right digonal
        if (row+col==(board.getDimensions()-1))
        {
            if(!rightDiagMap.containsKey(symbol))
            {
                rightDiagMap.put(symbol,0);
            }
            rightDiagMap.put(symbol,rightDiagMap.get(symbol));
            if(rightDiagMap.get(symbol).equals(board.getDimensions()))
            {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public void handelUndo(Board board, Move lastMove) {
        int row = lastMove.getCell().getRow();
        int col = lastMove.getCell().getCol();
        Character symbol = lastMove.getPlayers().getSymbol();

        if(row==col)
        {
            leftDiagMap.put(symbol,leftDiagMap.get(symbol)-1);
        }

        if(row+col==board.getDimensions()-1)
        {
            rightDiagMap.put(symbol,rightDiagMap.get(symbol)-1);
        }

    }
}
