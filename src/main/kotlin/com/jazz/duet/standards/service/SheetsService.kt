package com.jazz.duet.standards.service

import com.jazz.duet.standards.model.Sheet
import com.jazz.duet.standards.repository.SheetsRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class SheetsService(val sheetsRepository: SheetsRepository) {

    fun allSheets() : MutableIterable<Sheet> {
        return sheetsRepository.findAll()
    }

    fun getSheetById(id: Long): Optional<Sheet> {
        return sheetsRepository.findById(id)
    }

    fun createSheet(sheet: Sheet) : Sheet {
        if (sheet.sheet_id != null) {
            sheet.sheet_id = null
        }

        return sheetsRepository.save(sheet)
    }

    fun updateSheet(id: Long, sheet: Sheet): Sheet {
        var oldSheet = getSheetById(id).get()
        oldSheet.chords = sheet.chords
        oldSheet.key = sheet.key

        return sheetsRepository.save(oldSheet)
    }

    fun deleteSheet(id: Long) {
        sheetsRepository.deleteById(id)
    }

}