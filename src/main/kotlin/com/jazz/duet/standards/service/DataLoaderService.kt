package com.jazz.duet.standards.service

import com.jazz.duet.standards.model.Sheet
import com.jazz.duet.standards.model.Standard
import com.jazz.duet.standards.repository.SheetsRepository
import com.jazz.duet.standards.repository.StandardsRepository
import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

@Service
class DataLoaderService(val standardsRepository: StandardsRepository, val sheetsRepository: SheetsRepository) {

    @PostConstruct
    fun init() {
        var sheet1 = Sheet("|Eb |Eb |Dm7b5 |G7 |Cm7 |Cm7 |Bbm7 |Eb7 |Ab |Db7 |Eb |Cm7 |F7 |F7 " +
                "|Fm7 |Bb7||Eb |Eb |Dm7b5 |G7 |Cm7 |Cm7 |Bbm7 |Eb7 |Ab |Db7 |Eb |Am7b5 D7 |Gm7 Ab" +
                " |Gm7 C7 |Fm7 B7 |Eb|", "Eb")

        sheet1 = sheetsRepository.save(sheet1)

        var standard1 = Standard("There Will Never Be Another You", sheet1, "https://www.youtube" +
                ".com/watch?v=lkB9w50wGPI", "H. Warren")

        standard1 = standardsRepository.save(standard1)
    }
}