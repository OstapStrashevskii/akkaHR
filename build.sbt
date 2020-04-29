name := "akka-quickstart-scala"

version := "1.0"

scalaVersion := "2.13.1"

lazy val akkaVersion = "2.6.4"

lazy val akkaHttpVersion = "10.2.0-M1"


libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor-typed" % akkaVersion,
  "ch.qos.logback" % "logback-classic" % "1.2.3",

  "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
  "com.typesafe.akka" %% "akka-stream" % akkaVersion,

  "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % Test,
  "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,
  "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test,
  "com.typesafe.akka" %% "akka-actor-testkit-typed" % akkaVersion % Test,
  "org.scalatest" %% "scalatest" % "3.1.0" % Test,

//        "com.typesafe.akka" %% "akka-actor" % akkaVersion

)

//lazy val akkaHttpVersion = "10.0.10"
//lazy val akkaVersion = "2.5.4"
//
//name := "AkkaHR"
//version := "0.1"
//scalaVersion := "2.12.3"
//
//
//    libraryDependencies ++= Seq(
//      "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
//      "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
//      "com.typesafe.akka" %% "akka-stream" % akkaVersion,
//
//      "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % Test,
//      "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,
//      "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test,
//      "org.scalatest" %% "scalatest" % "3.0.1" % Test,
//
//      "com.typesafe.akka" %% "akka-actor" % akkaVersion
//    )

//lazy val root = (project in file(".")).
//  settings(
//    inThisBuild(List(
//      organization := "com.epam",
//      scalaVersion := "2.12.3"
//    )),
//    name := "epam.scala.akkaProjHR",
//    libraryDependencies ++= Seq(
//      "com.typesafe.akka" %% "akka-http" % akkaHttpVersion,
//      "com.typesafe.akka" %% "akka-http-spray-json" % akkaHttpVersion,
//      "com.typesafe.akka" %% "akka-stream" % akkaVersion,
//
//      "com.typesafe.akka" %% "akka-http-testkit" % akkaHttpVersion % Test,
//      "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,
//      "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test,
//      "org.scalatest" %% "scalatest" % "3.0.1" % Test,
//
//      "com.typesafe.akka" %% "akka-actor" % akkaVersion
//    )
//)


//akkaActor = "com.typesafe.akka" %% "akka-actor" % Version.akka