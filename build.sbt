name := "FocalPoint"

version := "1.0"

scalaVersion := "2.12.3"


libraryDependencies += "com.github.nscala-time" %% "nscala-time" % "2.16.0"

// Overrides the "mainclass" setting in the "Compile" configuration
mainClass in Compile := Some("Main") //Used in Universal packageBin

// Overrides the "mainClass" setting in the "Compile" configuration, only during the "run" task
mainClass in (Compile, run) := Some("Main") //Used from normal sbt
