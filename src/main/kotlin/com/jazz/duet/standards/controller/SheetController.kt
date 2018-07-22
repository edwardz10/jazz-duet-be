package com.jazz.duet.standards.controller

import com.google.common.collect.FluentIterable
import com.jazz.duet.standards.model.Sheet
import com.jazz.duet.standards.service.SheetsService
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.validation.constraints.NotNull

@RestController
@RequestMapping(
        value = ["/api/sheets"])
class SheetController(val sheetsService: SheetsService) {

    @GetMapping(value = "/all")
    fun allSheets(): List<Sheet> =
            FluentIterable.from(sheetsService.allSheets()).toList()

    @GetMapping(value = "/{id}")
    fun getSheetById(@NotNull @PathVariable("id")
                     id: Long): Optional<Sheet> =
            sheetsService.getSheetById(id)

    @PostMapping(value = "/new", consumes = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun createSheet(@NotNull @RequestBody Sheet: Sheet): Sheet =
            sheetsService.createSheet(Sheet)

    @PutMapping(value = "/{id}", consumes = arrayOf(MediaType.APPLICATION_JSON_VALUE))
    fun updateSheet(@NotNull @PathVariable("id")
                    id: Long,
                    @NotNull @RequestBody Sheet: Sheet): Sheet =
            sheetsService.updateSheet(id, Sheet)

    @DeleteMapping(value = "/{id}")
    fun deleteSheet(@NotNull
                    @PathVariable("id")
                    id: Long) =
            sheetsService.deleteSheet(id)
}