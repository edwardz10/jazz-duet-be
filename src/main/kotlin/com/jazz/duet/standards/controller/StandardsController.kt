package com.jazz.duet.standards.controller

import com.google.common.collect.FluentIterable
import com.jazz.duet.standards.model.Standard
import com.jazz.duet.standards.service.StandardsService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*
import javax.validation.constraints.NotNull

@RestController
@RequestMapping(
        value = ["/api/standards"])
class StandardsController(val standardsService: StandardsService) {

    @GetMapping(value = "/all")
    fun allStandards(): List<Standard> =
            FluentIterable.from(standardsService.allStandards()).toList()

    @GetMapping(value = "/{id}")
    fun getStandardById(@NotNull
                        @PathVariable("id")
                        id: Long): Optional<Standard> =
            standardsService.getStandardById(id)

}