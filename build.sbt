name := "PluginManager"

version := "1.2.1"

scalaVersion := "2.11.2"

sbtPlugin := true

javacOptions ++= Seq("-source", "1.7", "-target", "1.7")

resolvers += "bukkit-repo" at "http://repo.bukkit.org/content/groups/public"

libraryDependencies += "org.bukkit" % "craftbukkit" % "1.7.10-R0.1-SNAPSHOT"

autoScalaLibrary := false