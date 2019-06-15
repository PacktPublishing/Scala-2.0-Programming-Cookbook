

//reading the content of the file 
import java.io.File 
import scala.io.Source

def readFileContent(filePath: String): Either[String, List[String]] = {
       val f = new File(filePath)
       try{
           Right(Source.fromFile(f).getLines.toList)
          }
             catch {
                case _ : Throwable => Left("cannot read file content")
          }
      }

val content = readFileContent("/etc/hosts")
//content: Either[String, List[String]] = Right(List("##".....))


//using the isRight and isLeft method

content.isLeft //false
content.isRight //true

content match {
  case Right(list) => list.foreach(println)
  case Left(error) => println(error)
}

//using the getOrElse method.
content.map(x => x.map(_.toUpperCase)) //change the entire content to upper case letters.
content.getOrElse(List[String]()) //if the Left is return use an empty List of strings. 


//changing either type to option type 

content.toOption


//using the either type with for-comprehension
val contents = for{
  c1 <- readFileContent("/etc/hosts")
  c2 <- readFileContent("/etc/passwd")
} yield c1 ++ c2 


