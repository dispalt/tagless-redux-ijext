package com.example

import cats.tagless.{autoFunctorK, finalAlg}
import com.dispalt.tagless.kryo.kryoEncoder

//@finalAlg
//@autoFunctorK
//@kryoEncoder
//trait Funct[F[_]] {
//  def test: F[Int]
//}
//
//object Funct

@finalAlg
@kryoEncoder
@autoFunctorK
trait Funct2[F[_]] {
  def test: F[Int]
}

object Funct2
