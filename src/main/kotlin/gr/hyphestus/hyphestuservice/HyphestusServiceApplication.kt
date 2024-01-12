package gr.hyphestus.hyphestuservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HyphestusServiceApplication

fun main(args: Array<String>) {
    runApplication<HyphestusServiceApplication>(*args)
}
