package com.jazz.duet.standards.repository

import com.jazz.duet.standards.model.Sheet
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface SheetsRepository : CrudRepository<Sheet, Long> {
}