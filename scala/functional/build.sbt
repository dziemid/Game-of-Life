name := "Game of Life in Scala"

version := "1.0"

scalaVersion := "2.9.1"

retrieveManaged := true

libraryDependencies ++= Seq(
	"org.mockito" % "mockito-all" % "1.8.5",
    "org.hamcrest" % "hamcrest-all" % "1.1",
    "junit" % "junit" % "4.7"
)

resolvers += "Scala-Tools Maven2 Snapshots Repository" at "http://scala-tools.org/repo-snapshots"