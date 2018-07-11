package com.jazz.duet.standards.repository

import com.jazz.duet.standards.model.Standard
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface StandardsRepository: CrudRepository<Standard, Long>{
}