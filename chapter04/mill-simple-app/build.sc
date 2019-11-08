
//build.sc

import mill._, scalalib._ 

object cookbook extends ScalaModule {
   def scalaVersion = "2.12.8" 

   def scalacOptions = Seq(
    "-deprecation", 
    "-feature", 
    "-unchecked"
  )

      def ivyDeps = Agg(
       ivy"com.github.nscala-time::nscala-time:2.22.0",
       ivy"org.scalatest::scalatest:3.0.5"
      )

 object test extends Tests{

   def testFrameworks = Seq("org.scalatest.tools.Framework")
   }


}




