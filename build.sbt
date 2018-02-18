name := "scala-tests"

version := "0.1"

scalaVersion := "2.12.4"

libraryDependencies += "javax.servlet" % "javax.servlet-api" % "3.0.1"

enablePlugins(JettyPlugin)

libraryDependencies += "org.scala-lang.modules" %% "scala-xml" % "1.0.6"

libraryDependencies ++= Seq(
  // For the console exercise, the logback dependency
  // is only important if you want to see all the
  // debugging output. If you don't want that, simply
  // omit it.
  "ch.qos.logback"          %  "logback-classic" % "1.2.3",
  "net.databinder.dispatch" %% "dispatch-core"   % "0.13.3"
)

lazy val commonSettings = Seq(
  version := "0.1-SNAPSHOT",
  organization := "com.example",
  scalaVersion := "2.10.1",
  test in assembly := {}
)

lazy val app = (project in file("app")).
  settings(commonSettings: _*).
  settings(
    mainClass in assembly := Some("Main"),
    // more settings here ...
  )

lazy val utils = (project in file("utils")).
  settings(commonSettings: _*).
  settings(
    assemblyJarName in assembly := "utils.jar",
    // more settings here ...
  )
