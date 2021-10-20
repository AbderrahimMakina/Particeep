package com.particeep.test.akka

import akka.actor.Actor

import scala.concurrent.Future
import scala.util.{ Failure, Success }
import scala.concurrent.ExecutionContext.Implicits.global

/**
 * Do you see anything that could lead to potential problems ?
 * What would you do to fix it ?
 * Do not mind about the not implemented code
 */
class WhatsWrong3 extends Actor {

  var internalState = "internal state"

  def receive: Receive = {
    case "a query" => {
      val requestF: Future[String] = queryAsyncServer()
      requestF.onComplete {
        case Success(r) => handleResponse(r)
        case Failure(e) => e.printStackTrace()
        // This works correctly when the authActor sends a failure,
        // but if the authActor throws an exception, nothing happens so we should consider an other case :
        case e => complete(StatusCodes.InternalServerError,"Unable to complete the request. Please try again later.")
        //In reality this returns a custom error object.
      }
    }
  }

  def handleResponse(r: String) = ??? // mutate internal state

  def queryAsyncServer(): Future[String] = ???
}
