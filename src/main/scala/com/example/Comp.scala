package com.example

import slinky.core.StatelessComponent
import slinky.core.annotations.react
import slinky.core.facade.ReactElement
import slinky.web.html.h1

@react class Comp extends StatelessComponent {
  case class Props(n: String)

  override def render(): ReactElement = h1("Hello")
}
