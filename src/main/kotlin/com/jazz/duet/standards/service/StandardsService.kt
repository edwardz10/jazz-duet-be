package com.jazz.duet.standards.service

import com.jazz.duet.standards.model.Standard
import com.jazz.duet.standards.repository.SheetsRepository
import com.jazz.duet.standards.repository.StandardsRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class StandardsService(val standardsRepository: StandardsRepository,
                       val sheetsRepository: SheetsRepository) {

    fun allStandards() : MutableIterable<Standard> {
        return standardsRepository.findAll()
    }

    fun getStandardById(id: Long): Optional<Standard> {
        return standardsRepository.findById(id)
    }

    fun createStandard(standard: Standard) : Standard {
        if (standard.standard_id != null) {
            standard.standard_id = null
        }

        if (standard.sheet.sheet_id != null) {
            standard.sheet.sheet_id = null;
        }

        standard.sheet = sheetsRepository.save(standard.sheet)
        return standardsRepository.save(standard)
    }

    fun updateStandard(id: Long, standard: Standard): Standard {
        var oldStandard = getStandardById(id).get()
        oldStandard.name = standard.name
        oldStandard.author = standard.author
        oldStandard.video = standard.video

        if (!oldStandard.sheet.equals(standard.sheet)) {
            oldStandard.sheet = sheetsRepository.save(standard.sheet)
        }

        return standardsRepository.save(oldStandard)
    }

    fun deleteStandard(id: Long) {
        standardsRepository.deleteById(id)
    }

}