package game

import org.junit._
import org.junit.Assert._
import org.hamcrest.core.Is._

class PositionTest {

  @Test def shouldHaveNeighbours() {
    assertThat(Position(1, 1).neighbours, is(Set(
      Position(0, 0), Position(1, 0), Position(2, 0),
      Position(0, 1), Position(2, 1),
      Position(0, 2), Position(1, 2), Position(2, 2)
    )))
  }

}