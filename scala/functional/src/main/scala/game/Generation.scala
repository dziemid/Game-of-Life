package game

case class Generation (aliveCells : Seq[Position]) {

  lazy val next : Generation = {
    Generation(Seq())
  }

}