package com.cookbook.timeChecker


import java.time.LocalTime
import akka.actor.{Actor, ActorLogging}



 object TimerActor{
   case object CheckTime 
   case object InvalidMessage 
   case class TimerResponse(time: String)
   
}

class TimerActor extends Actor with ActorLogging {

     import TimerActor._ 

      def receive = {
      case CheckTime => 
        log.info(s" Received a message")
        val time = TimerResponse(LocalTime.now.toString)
         
        log.info(s" responding with a time: ${time} ") 
        sender ! time

     case _ => 
         log.error("an unknown message was received") 
         sender ! InvalidMessage
   }
}
