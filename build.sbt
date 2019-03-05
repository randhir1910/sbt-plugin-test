
lazy val root = (project in file(".")).aggregate(core, util)

lazy val core = (project in file("core")).settings(
  moduleName := "core",
  name := "sbt-plugin-test",
  organizationName := "knoldus",
  libraryDependencies += "com.typesafe" % "config" % "1.3.3"
)

lazy val util = (project in file("util")).settings(
  moduleName := "util",
  name := "sbt-plugin-test",
  organizationName := "knoldus",
)