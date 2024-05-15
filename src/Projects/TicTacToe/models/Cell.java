package Projects.TicTacToe.models;

public class Cell {
    int row;
    int col;
    private CellState cellState;
    private Players players;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
        this.cellState=CellState.EMPTY;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public Players getPlayers() {
        return players;
    }

    public void setPlayers(Players players) {
        this.players = players;
    }

    public void printCell() {
        if (cellState.equals(CellState.FILLED))
        {
            System.out.print("| "+players.getSymbol()+" |");
        }
        else
        {
            System.out.print("| - |");
        }
    }
}
