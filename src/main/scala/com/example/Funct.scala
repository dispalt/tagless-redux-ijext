package com.example

import cats.tagless.{autoFunctorK, finalAlg}

@autoFunctorK
trait Funct2[F[_]] {
  def test: F[Int]
}

object Funct2
