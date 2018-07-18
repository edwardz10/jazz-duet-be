package com.jazz.duet.standards.controller

import com.google.common.collect.FluentIterable
import com.jazz.duet.standards.model.Standard
import com.jazz.duet.standards.service.StandardsService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
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
    fun getStandardById(@NotNull @PathVariable("id")
                        id: Long): Optional<Standard> =
            standardsService.getStandardById(id)

    @PostMapping(value = "/new", consumes = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun createStandard(@NotNull @RequestBody standard: Standard) : Standard =
            standardsService.createStandard(standard)

    @PutMapping(value = "/{id}", consumes = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun updateStandard(@NotNull @PathVariable("id")
                       id: Long,
                       @NotNull @RequestBody standard: Standard) : Standard =
            standardsService.updateStandard(id, standard)

    @DeleteMapping(value = "/{id}")
    fun deleteStandard(@NotNull
                       @PathVariable("id")
                       id: Long) =
            standardsService.deleteStandard(id)

}