package com.example
import io.micronaut.runtime.EmbeddedApplication
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import jakarta.inject.Inject

@MicronautTest
class FifaApiTest {

    @Inject
    lateinit var application: EmbeddedApplication<*>

    @Inject
    lateinit var ping: Ping

    @Test
    fun testItWorks() {
        Assertions.assertTrue(application.isRunning)
    }

    @Test
    fun testPing() {
        Assertions.assertTrue(ping.ping() == "pong")
    }

}
