package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/ping")
class Ping {
    @Get
    fun ping() = "pong"
}