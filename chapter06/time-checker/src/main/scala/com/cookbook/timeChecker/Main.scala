package com.cookbook.timeChecker

import akka.actor.{ActorSystem, Props }
import TimerActor._ 

object Main extends App {

  val system = ActorSystem("time-checker-app")
  val timerActor = system.actorOf(Props[TimerActor])
  
  timerActor ! CheckTime
} 
