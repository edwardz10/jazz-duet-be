package com.jazz.duet.standards.service

import com.jazz.duet.standards.model.Standard
import com.jazz.duet.standards.repository.StandardsRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
class StandardsService(val standardsRepository: StandardsRepository) {

    fun allStandards() : MutableIterable<Standard> {
        return standardsRepository.findAll()
    }

    fun getStandardById(id: Long): Optional<Standard> {
        return standardsRepository.findById(id)
    }
}