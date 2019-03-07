package com.example

//import cats.tagless.FunctorK
import cats.tagless.FunctorK
import cats.tagless.syntax.all._
import cats.~>

import scala.util.Try

class Runit {
  implicit object OptionFunc extends Funct2[Try] {
    override def test: Try[Int] = Try(1)
  }

  implicit val fk: Try ~> Option = λ[Try ~> Option](_.toOption)

  OptionFunc.mapK(fk)

  val fk2 = FunctorK[Funct2]

}
