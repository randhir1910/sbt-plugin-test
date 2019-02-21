import com.knoldus.MyPlugin._

lazy val root = (project in file("."))
  .enablePlugins(SbtPlugin)
  .settings(
    name := "sbt-plugin-test",
    version := "0.1",
      scalaVersion := "2.12.8",
    scriptedBufferLog := false,
    organisationName := "knoldus",
    projectName := "codesquad",
    moduleName1 := "akka",
    myPluginSettings,
  )