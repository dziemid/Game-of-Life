package game

case class Position(x: Int, y: Int) {

  lazy val neighbours: Set[Position] =
    (for {px <- (-1 to 1)
          py <- (-1 to 1)
          if !(px == 0 && py == 0)
    } yield Position(x + px, y + py)).toSet

  override def toString = "(" + x + " " + y + ")"
}