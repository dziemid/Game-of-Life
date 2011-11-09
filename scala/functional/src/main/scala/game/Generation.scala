package game

case class Generation(aliveCells: Set[Position]) {

  lazy val next: Generation = {
    val positionsToConsider = aliveCells.flatMap(c => c.neighbours)
    val nextGenerationCells = for (position <- positionsToConsider if shouldBeAlive(position)) yield position
    Generation(nextGenerationCells)
  }

  private def shouldBeAlive(position: Position): Boolean = {
    val neighboursCount = countAlive(position.neighbours)
    val isAlive: Boolean = aliveCells.contains(position)

    (isAlive, neighboursCount) match {
      case (true, 2) | (_, 3) => true
      case _ => false;
    }
  }

  private def countAlive(neighbours: Set[Position]) = neighbours.filter(p => aliveCells.contains(p)).size

}