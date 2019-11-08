
//domain name to Ip translator
import java.net.InetAddress
import scala.util.{ Try, Success, Failure }

def domain2Ip(host: String): Try[String] = {
   Try(InetAddress.getByName(host).getHostAddress)
}


//using pattern matching on the domain2Ip return value
domain2Ip("google.com") match {
  case Success(ip) => println(s"successfully got the ip $ip")
  case Failure(error) => println(s"couldnt get the ip, having error : ${error.getMessage}")
}

//testing if the computation was success 
val ip = domain2Ip("tesla.com")
ip.isSuccess //true
ip.isFailure //false 

ip.getOrElse("0.0.0.0")


//chaining multiple Try computation 
def isPingable(ip: String): Try[Boolean] = {
  Try(InetAddress.getByName(ip).isReachable(1000)) 
} 


//chaining domain2Ip and isPingable 
val google = domain2Ip("google.com").map(x => isPingable(x))
google: Try[Try[Boolean]] = Success(Success(false))


//using the flatMap 
val google = domain2Ip("google.com").flatMap(x => isPingable(x))
google: Try[Boolean] = Success(false)


//using the for-comprehension to chain Try computation 
def pingableDomain(host: String): Try[Boolean] = {
  for{
        ip <- domain2Ip(host)
        pinged <- isPingable(ip)
     } yield pinged
}

//using the recover method to manage exception state in Try computation
import java.net.UnknownHostException
val response = pingableDomain("xxx") recover {
  case e: UnknownHostException => "Host unreachable" 
  case _ => "Unexpected error occurred"
}

//converting Try type to an Option type
val response2 = pingableDomain("xxx").toOption //None 

