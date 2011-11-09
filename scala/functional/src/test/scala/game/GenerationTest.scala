package game

import org.junit._
import org.junit.Assert._
import org.hamcrest.core.Is._

class GenerationTest {

  @Test def lonelyCellShouldDie() {
    def lonelyCell = Generation(Seq(Position(1, 1)))

    val nextGeneration = lonelyCell.next

    assertThat(nextGeneration.aliveCells.size, is(0));
  }


}