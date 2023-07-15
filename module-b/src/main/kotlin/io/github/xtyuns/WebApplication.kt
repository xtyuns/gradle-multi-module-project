package io.github.xtyuns

import io.github.xtyuns.modulea.util.PrintUtils
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class WebApplication

fun main(args: Array<String>) {
    val runApplication = runApplication<WebApplication>(*args)
    PrintUtils.sayHello(runApplication.id!!)
}