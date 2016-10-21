name := "scalajs-seed"

organization := "io.bigbears"

version := "1.0"

scalaVersion := "2.11.8"

lazy val root = (project in file(".")).enablePlugins(ScalaJSPlugin)

libraryDependencies ++= Seq(
  "be.doeraene" %%% "scalajs-jquery" % "0.9.0"
  , "org.scala-js" %%% "scalajs-dom" % "0.9.1"
)

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.4.3" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")

jsDependencies += RuntimeDOM

skip in packageJSDependencies := false
jsDependencies ++= Seq(
  "org.webjars" % "jquery" % "2.1.4" / "2.1.4/jquery.js"
)

persistLauncher := true
