package me.anwarshahriar

import io.ktor.application.*
import io.ktor.response.*
import io.ktor.http.ContentType
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty

fun main(args: Array<String>) {
  embeddedServer(Netty, port = 8080) {
    routing {
      get("/") {
        call.respondText("Hello Ktor!", ContentType.Text.Plain)
      }
      get("/demo") {
        call.respondText("Hello Ktor demo!", ContentType.Text.Plain)
      }
    }
  }.start(wait = true)
}