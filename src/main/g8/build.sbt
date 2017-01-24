name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test" withSources() withJavadoc(),
  "org.scalacheck" %% "scalacheck" % "1.13.4" % "test" withSources() withJavadoc(),
  "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0",
  "ch.qos.logback" % "logback-classic" % "1.1.7",
  "com.typesafe" % "config" % "1.3.1"
)

initialCommands := "import $organization$.$name;format="lower,word"$._"

