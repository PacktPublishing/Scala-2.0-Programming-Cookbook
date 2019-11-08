
lazy val sharedSettings = Seq(

  version := "0.1.0", 
  organization := "com.cookbook", 
  scalaVersion := "2.12.8"
)

lazy val tempLogger = (project in file (".")).aggregate(temp,web,core)


lazy val temp = (project in file("temp"))
    .settings(
      sharedSettings, 
      libraryDependencies ++= Seq(
         "org.scalatest" %% "scalatest" % "3.0.7" % Test
       )
    ).dependsOn(core,web)

lazy val core = (project in file("core"))
  .settings(sharedSettings)
  .dependsOn(util)
  

lazy val web = (project in file("web"))
   .settings(sharedSettings)
