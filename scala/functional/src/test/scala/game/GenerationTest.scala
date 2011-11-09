package game

import org.junit._
import org.junit.Assert._
import org.hamcrest.core.Is._

class GenerationTest {

  val lonelyCell = Set(Position(1, 1))

  val block =  Set(
    Position(0, 0), Position(0, 1),
    Position(1, 0), Position(1, 1)
  )

  val reproducable =  Set(
    Position(0, 0), Position(0, 1),
    Position(1, 0)
  )

  @Test def lonelyCellShouldDie() {
    val generation = Generation(lonelyCell)

    val nextGeneration = generation.next

    assertThat(nextGeneration.aliveCells.size, is(0));
  }

  @Test def blockShouldBeStatic() {
    val generation = Generation(block)

    val nextGeneration = generation.next

    assertThat(nextGeneration.aliveCells, is(block));
  }

  @Test def threeLivingCellsCreateLive() {
    val generation = Generation(reproducable)

    val nextGeneration = generation.next

    assertThat(nextGeneration.aliveCells, is(block));
  }

}