name := "osgood"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "com.typesafe" % "config" % "1.3.0"


assemblyJarName in assembly := "osgood-1.0.jar"

mainClass in assembly := Some("osgood.Server")