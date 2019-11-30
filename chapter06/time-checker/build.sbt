scalaVersion := "2.12.8" 

organization := "com.cookbook" 

lazy val adder = (project in file("."))
    .settings(
         name := "TimeChecker", 

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor"   % "2.5.25",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.25" % Test,
  "org.scalatest"     %% "scalatest"    % "3.0.8"  % Test
       )
)



