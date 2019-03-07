val tredux = "0.2.4"

lazy val testP = (project in file("."))
  .settings(
    scalaVersion := "2.12.6",
    libraryDependencies ++= Seq(
      "com.dispalt" %% "tagless-redux-macros" % tredux,
      "com.dispalt" %% "tagless-redux-encoder-kryo" % tredux,
    ),
    addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.9"),
    macroSettings,
    scalacOptions ++= commonScalacOptions
  )

lazy val commonScalacOptions = Seq(
  "-deprecation",
  "-encoding",
  "UTF-8",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:experimental.macros",
  "-unchecked",
  "-Xlint",
  "-Yno-adapted-args",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Ywarn-unused-import",
  "-Ypartial-unification",
  "-Xsource:2.13"
)

lazy val macroSettings: Seq[Def.Setting[_]] = Seq(
  resolvers += Resolver.sonatypeRepo("releases"),
  resolvers += Resolver.bintrayRepo("scalameta", "maven"),
  libraryDependencies +=
    compilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
)
