package io.scalac.wsakka

import akka.http.scaladsl.testkit.{WSProbe, ScalatestRouteTest}
import org.scalatest.{Matchers, FlatSpecLike, FunSuite}

class EchoServiceTest extends FlatSpecLike with Matchers with ScalatestRouteTest {

  "Echo Websocket" should "response by websocket connection" in {
    val wsClient = WSProbe()

    WS("/ws-echo", wsClient.flow) ~> EchoService.route ~> check {

      this should be an 'isWebSocketUpgrade

      wsClient.sendMessage("Mario")
      wsClient.expectMessage("ECHO: Mario")

      wsClient.sendCompletion()
      wsClient.expectCompletion()
    }
  }

}
