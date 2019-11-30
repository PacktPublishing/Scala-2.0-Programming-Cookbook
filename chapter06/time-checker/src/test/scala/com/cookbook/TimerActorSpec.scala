package com.cookbook.timeChecker

import akka.actor.{ActorRef, ActorSystem, Props}
import akka.testkit.{ImplicitSender, TestKit}
import org.scalatest.{BeforeAndAfterAll, WordSpecLike}

import com.cookbook.timeChecker._



class TimerActorSpec extends TestKit(ActorSystem("time-checker-app-test")) 
  with ImplicitSender
  with WordSpecLike
  with BeforeAndAfterAll {

val timerActor = system.actorOf(Props[TimerActor])

import TimerActor._

  "The TimerActor" should   {

    "response with a time when it receives a CheckTime message" in {
       timerActor ! CheckTime 
       expectMsgType[TimerResponse] 
   }

 "response to any invalid message received" in {
     timerActor ! "hello"
     expectMsg(InvalidMessage)
  }
}

 override def afterAll(): Unit = {
    TestKit.shutdownActorSystem(system)
  }


}
