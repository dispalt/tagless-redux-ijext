package com.example

import slinky.core._
import slinky.web.ReactDOM
import slinky.web.html._

import org.scalajs.dom.document

object TutorialApp {

  def main(args: Array[String]): Unit = {
    println("FOOOO")
    println("Hello world!")
    ReactDOM.render(Comp(""), document.getElementById("root"))
  }
}
