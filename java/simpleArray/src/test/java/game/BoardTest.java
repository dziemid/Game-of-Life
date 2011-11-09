package game;

import static game.Cell.ALIVE;
import static game.Cell.DEAD;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

import org.junit.Test;

import java.util.List;

public class BoardTest {

    @Test
    public void shouldCreateBoardFullOfDeadCells() throws Exception {
        // Given
        Board board = new Board(10, 10);

        // When
        List<Cell> boardCells = board.getCells();

        // Then
        assertThat(boardCells.size(), is(100));

        for (Cell c : boardCells) {
            assertThat(c, is(DEAD));
        }
    }

    @Test
    public void shouldBePossibleToMakeCellAlive() throws Exception {
        // Given
        Board board = new Board(10, 10);

        // When
        board.setAlive(2,3);
        Cell c = board.getCell(2,3);

        // Then
        assertThat(c, is(ALIVE));
    }

    @Test
    public void shouldBePossibleToMakeCellDead() throws Exception {
        // Given
        Board board = new Board(10, 10);
        board.setAlive(2,3);

        // When
        board.setDead(2,3);
        Cell c = board.getCell(2,3);

        // Then
        assertThat(c, is(DEAD));
    }
}
