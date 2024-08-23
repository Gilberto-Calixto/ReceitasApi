package example.com

import example.com.content.DatabaseFactory
import example.com.plugins.*
import io.ktor.serialization.kotlinx.json.*
import io.ktor.server.application.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.routing.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {



//    configureSerialization()
//    configureDatabases()
//    configureRouting()
}
