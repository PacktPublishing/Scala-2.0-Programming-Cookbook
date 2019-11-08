import mill._, scalalib._
import coursier.maven._

trait SharedModule extends  SbtModule {
   def scalaVersion = "2.12.8"

   def scalacOptions = Seq(
    "-deprecation", 
    "-feature", 
    "-unchecked"
  )

   def repositories = super.repositories ++ Seq(
      MavenRepository("https://oss.sonatype.org/content/repositories/releases")
   )
}

object core extends SharedModule  {
   def ivyDeps = Agg(
      ivy"com.sun.mail:javax.mail:1.6.2",
      ivy"io.circe::circe-core:0.10.0",
      ivy"org.scalatest::scalatest:3.0.5"
   )
}

object web extends SharedModule{
   def mainClass    = Some("web.Main")
   def moduleDeps   = Seq(core, temp)
}

object temp extends SharedModule{
   def moduleDeps = Seq(core)

 object test extends Tests{

   def testFrameworks = Seq("org.scalatest.tools.Framework")
   }

   }