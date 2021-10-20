package com.particeep.test.akka

import akka.actor.{ Actor, ActorSystem, Props }

/**
 * Question about Akka framework http://akka.io
 *
 * When receiving a message that says "Hello", BasicActor must print "Hello there."
 * It must print "What?" when receiving any other message
 */
class BasicActor extends Actor {

  def receive = {
    case "hello" => println("hello There")
    case _       => println("what?")
  }


}



object FireActor {

  /**
   * Create an instance of BasicActor
   *
   * Make it print "Hello there." and "What?"
   */
  def fireActor(): Unit = {
    //   val system = ActorSystem("Actor System")
   //   val basic_actor = system.actorOf(Props[BasicActor], name = "basic actor")

    val system = ActorSystem("Actor System")
    // default Actor constructor
    val basic_actor = system.actorOf(Props[BasicActor], name = "basic actor")
    basic_actor ! "hello there"
    basic_actor ! "what"

  }
}
