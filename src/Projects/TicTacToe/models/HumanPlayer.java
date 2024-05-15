package Projects.TicTacToe.models;

import java.util.Scanner;

public class HumanPlayer extends Players{

public Scanner scanner;
    public HumanPlayer(Character symbol, String name, int id, PlayerType playerType,Scanner scanner) {
        super(symbol, name, id, playerType);
        this.scanner=scanner;
    }

    @Override
    public Cell makeMove(Board board) {
        System.out.println(this.getName()+",its your turn to make the move, enter row and col no");
        int row=scanner.nextInt();
        int col=scanner.nextInt();
        while(!validateRowAndColumn(row,col,board)){
             System.out.println(this.getName()+",invalid move please enter row and col again");
             row=scanner.nextInt();
             col=scanner.nextInt();
        }
        //its a valid move
        Cell cell=board.getBoard().get(row).get(col);
        cell.setCellState(CellState.FILLED);
        cell.setPlayers(this);
        return cell;

    }

    private boolean validateRowAndColumn(int row, int col, Board board) {
        if(row>=board.getDimensions() || row<0) {
            return false;
        }
        if(col>=board.getDimensions() || col<0)
        {
            return false;
        }
        if(CellState.FILLED.equals(board.getBoard().get(row).get(col).getCellState()))
        {
            return false;
        }
        return true;
    }
}
