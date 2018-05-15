package ml.senior_sigan.service_1

import org.springframework.beans.factory.annotation.Value
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@EnableDiscoveryClient
class Service1Application

fun main(args: Array<String>) {
    runApplication<Service1Application>(*args)
}

@RestController
class Api(
    @Value("\${my.prop}") private val prop: String
) {
    @GetMapping("/")
    fun getHello() = Response(hello = "world", prop = prop)

    data class Response(val hello: String, val prop: String)
}
