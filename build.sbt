val reduxV  = "0.3.1"
val slinkyV = "0.6.3"

lazy val testP = (project in file("."))
  .settings(
    scalaVersion := "2.12.10",
    libraryDependencies ++= Seq("com.dispalt" %% "tagless-redux-macros" % reduxV),
    addCompilerPlugin("org.spire-math"        %% "kind-projector"       % "0.9.9"),
    macroSettings,
    scalacOptions ++= commonScalacOptions,
    // This is an application with a main method
    scalaJSUseMainModuleInitializer := true,
    libraryDependencies += "me.shadaj" %%% "slinky-core" % slinkyV, // core React functionality, no React DOM
    libraryDependencies += "me.shadaj" %%% "slinky-web"  % slinkyV, // React DOM, HTML and SVG tags
    libraryDependencies += "me.shadaj" %%% "slinky-hot"  % slinkyV // Hot loading, requires react-proxy package
  )
  .enablePlugins(ScalaJSPlugin)

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
