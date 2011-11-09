package game;

import java.util.*;

public class Board {

    private Cell[][] cells;

    public Board(int sizeX, int sizeY) {
        cells = new Cell[sizeX][sizeY];
        for (int x = 0; x < sizeX; x++)
            for (int y = 0; y < sizeY; y++)
                cells[x][y] = Cell.DEAD;
    }

    public Cell getCell(int x, int y) {
        return cells[x][y];
    }

    public void setAlive(int x, int y) {
        cells[x][y] = Cell.ALIVE;
    }

    public void setDead(int x, int y) {
        cells[x][y] = Cell.DEAD;
    }

    public List<Cell> getCells() {
        List<Cell> result = new ArrayList<Cell>();
        for (Cell[] row : cells) {
            Collections.addAll(result, row);
        }
        return result;
    }
}
