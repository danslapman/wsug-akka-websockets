name := "wsug-akka-websockets"

version := "1.0"

scalaVersion := "2.11.8"

organization := "io.scalac"

scalacOptions := Seq("-unchecked", "-feature", "-deprecation", "-encoding", "utf8", "-language:postfixOps")

libraryDependencies ++= {
  val logbackV = "1.1.7"
  val akkaV = "2.4.6"
  Seq(
    "com.typesafe.akka" %% "akka-actor" % akkaV,
    "com.typesafe.akka" %% "akka-http-experimental" % akkaV,
    "com.typesafe.akka" %% "akka-http-spray-json-experimental" % akkaV,
    "com.typesafe.akka" %% "akka-slf4j" % akkaV,
    "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0",
    "com.typesafe.akka" %% "akka-http-testkit" % akkaV % "test",
    "com.typesafe.akka" %% "akka-testkit" % akkaV % "test",
    "org.scalatest" %% "scalatest" % "2.2.1" % "test"
  )
}