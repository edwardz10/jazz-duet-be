package com.jazz.duet.standards.controller

import com.jazz.duet.standards.model.Standard
import com.jazz.duet.standards.service.StandardsService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(
        value = ["/standards"],
        consumes = [MediaType.APPLICATION_JSON_VALUE],
        produces = [MediaType.APPLICATION_JSON_VALUE])
class StandardsController(val standardsService: StandardsService) {

    @GetMapping(value = "/all")
    fun allStandards(): MutableIterable<Standard> = standardsService.allStandards()
}