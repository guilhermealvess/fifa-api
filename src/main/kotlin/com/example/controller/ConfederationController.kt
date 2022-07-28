package com.example.controller

import com.example.model.Confederation
import com.example.service.ConfederationService
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Delete
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.http.annotation.Post
import io.micronaut.http.annotation.Put
import java.util.UUID


@Controller("/confederation")
class ConfederationController(private val confederationService: ConfederationService) {

    @Post
    fun create(@Body confederation: Confederation):HttpResponse<Confederation> {
        confederationService.createConfederation(confederation)
        return HttpResponse.ok(confederation).status(HttpStatus.CREATED)
    }

    @Get
    fun search():HttpResponse<List<Confederation>> {
        val confederations = confederationService.search()
        return HttpResponse.ok(confederations).status(HttpStatus.OK)
    }

    @Get("/{id}")
    fun findById(@PathVariable id:UUID):HttpResponse<Confederation> {
        val confederation = confederationService.findById(id)
        return HttpResponse.ok(confederation).status(HttpStatus.OK)
    }

    @Put("/{id}")
    fun update(@PathVariable id: UUID, @Body confederation: Confederation):HttpResponse<Confederation> {
        val response = confederationService.updateConfederation(id, confederation)
        return HttpResponse.ok(response).status(HttpStatus.OK)
    }

    @Delete("/{id}")
    fun delete(@PathVariable id:UUID):HttpResponse<Any> {
        confederationService.deleteConfederation(id)
        return HttpResponse.status(HttpStatus.NO_CONTENT)
    }
}