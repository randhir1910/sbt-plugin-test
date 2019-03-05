package com.knoldus

/**
  * Testing project
  */
import com.typesafe.config.ConfigFactory
import scala.collection.JavaConversions._

object Test extends App {
  val config = ConfigFactory.load("codesquad.conf")

  val codesquadReports = config.getStringList("codesquad.reports").toList
  val codesquad = config.getString("codesquad.report")
  println(codesquad)
  codesquadReports.foreach(x => println(x))
}
