name := "GoogleCalculator"

version := "1.0.0"

scalaVersion := "2.9.1"

scalacOptions += "-deprecation"

// resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "org.jsoup" % "jsoup" % "1.6.1"
)
