package com.jazz.duet.standards.service

import com.jazz.duet.standards.model.Sheet
import com.jazz.duet.standards.model.Standard
import org.springframework.stereotype.Service
import javax.annotation.PostConstruct

@Service
class DataLoaderService(val standardsService: StandardsService) {

    @PostConstruct
    fun init() {
        saveSheetAndStandard(arrayOf("Eb ", "Eb ", "Dm7b5 ", "G7 ", "Cm7 ", "Cm7 ", "Bbm7 ", "Eb7 " 
                , "Ab ", "Db7 ", "Eb ", "Cm7 ", "F7 ", "F7 ", "Fm7 ", "Bb7 " 
                , "Eb ", "Eb ", "Dm7b5 ", "G7 ", "Cm7 ", "Cm7 ", "Bbm7 ", "Eb7 " 
                , "Ab ", "Db7 ", "Eb ", "Am7b5 D7 ", "Gm7 Ab", "Gm7 C7 ", "Fm7 B7 ", "Eb"),
                "Eb",
                "There Will Never Be Another You",
                "https://www.youtube.com/watch?v=lkB9w50wGPI",
                "H. Warren")

        saveSheetAndStandard(arrayOf("C ", "C ", "E7 ", "E7 ", "A7 ", "A7 ", "Dm7 ", "Dm7 " 
                , "E7 ", "E7 ", "Am7 ", "Am7 ", "D7 ", "D7 ", "Dm7 ", "G7" 
                , "C ", "C ", "E7 ", "E7 ", "A7 ", "A7 ", "Dm7 ", "Dm7 " 
                , "F6 ", "Fm7 ", "C ", "A7 ", "Dm7 ", "G7 ", "C ", "A7"),
                "C",
                "All Of Me",
                "https://www.youtube.com/watch?v=9l5U_v39h1s",
                "G. Marks")

        saveSheetAndStandard(arrayOf("G6/9 ", "G6/9 ", "G#6/9 ", "G#6/9 ", "G6/9 ", "G6/9 ", "E7 ", "E7 " 
                , "A7 ", "A7 ", "D7 ", "D7 ", "G/B ", "BbO ", "Am7 ", "D7 " 
                , "G6/9 ", "G6/9 ", "G#6/9 ", "G#6/9 ", "G6/9 ", "G6/9 ", "E7 ", "E7 " 
                , "Am6 ", "Cm6 ", "G/B ", "E7 ", "Am7 ", "D7 ", "G G#O ", "Am7 D7"),
                "G",
                "Hungaria",
                "https://www.youtube.com/watch?v=l_HKqgi32Rw",
                "folk")

        saveSheetAndStandard(arrayOf("F ", "F ", "F ", "F ", "F ", "F ", "D7 ", "D7 " 
                , "G7 ", "G7 ", "G7 ", "G7 ", "Bbm6 ", "Bbm6 ", "C7 ", "Eb7" 
                , "Ab ", "Eb7 ", "Ab ", "Eb7 ", "Ab ", "Eb7 ", "Ab ", "C7 " 
                , "F ", "F ", "F#O ", "F#O ", "Gm7 ", "C7 ", "F F#O ", "Gm7 C7"),
                "F",
                "China Boy",
                "https://www.youtube.com/watch?v=bQeOPDvrAN4",
                "P. Boutelje")

        saveSheetAndStandard(arrayOf("G7 ", "C7 ", "F ", "F ", "F7 ", "F7 ", "Bb ", "Bb " 
                , "Bbm6 ", "Bbm6 ", "F ", "D7 ", "G7 ", "G7 ", "C7 ", "C7" 
                , "G7 ", "C7 ", "F ", "F ", "F7 ", "F7 ", "Bb ", "Bb " 
                , "Bbm6 ", "Bbm6 ", "F ", "D7 ", "G7 ", "C7 ", "Am7 ", "D7"),
                "F",
                "Rose Room",
                "https://www.youtube.com/watch?v=bQeOPDvrAN4",
                "A. Hickman")

        saveSheetAndStandard(arrayOf("A ", "A ", "A ", "A ", "A/C# ", "CO ", "E7/B ", "E7 " 
                , "E7 ", "E7 ", "F7 ", "F7 ", "A/C# ", "CO ", "Bm7 ", "E7" 
                , "A ", "A ", "A ", "A ", "Em7 ", "A7 ", "D ", "D " 
                , "D ", "D#O ", "A7 ", "B7 ", "E7 ", "A CO ", "Bm E7"),
                "A",
                "Django's Tiger",
                "https://www.youtube.com/watch?v=AQW2RxwwnRo",
                "D. Reinhardt")

        saveSheetAndStandard(arrayOf("C7 ", "C7 ", "C7 ", "C7 ", "A7 ", "A7 ", "A7 ", "A7 " 
                , "G ", "G ", "B7 ", "Em ", "A7 ", "A7 ", "D7 ", "Db7" 
                , "C7 ", "C7 ", "C7 ", "C7 ", "A7 ", "A7 ", "A7 ", "A7 " 
                , "G ", "E7 ", "Am ", "Am ", "Cm6 ", "D7 ", "G ", "G7"),
                "C",
                "Limehouse Blues",
                "https://www.youtube.com/watch?v=nr47ZhrNfUY",
                "D. Furber")

        saveSheetAndStandard(arrayOf("C ", "C ", "Bb7 ", "A7 ", "Dm7 ", "A7 ", "Dm7 ", "Dm7 " 
                , "G7 ", "G7 ", "D7 ", "G7 ", "C/E ", "EbO ", "Dm7 ", "G7" 
                , "C ", "C ", "Bb7 ", "A7 ", "Dm7 ", "A7 ", "Dm7 ", "Dm7 " 
                , "F ", "F#O ", "C ", "A7 ", "Dm7 ", "G7 ", "C EbO ", "Dm G7"),
                "C",
                "My Melancholy Baby",
                "https://www.youtube.com/watch?v=alEi3HUNd2E",
                "E. Burnett")

        saveSheetAndStandard(arrayOf("F ", "Emb5 A7b9 ", "Dm7 G7 ", "Cm7 F7 " 
                , "Bb ", "Bbm7 Eb7 ", "Am7 D7 ", "Abm7 Dbm7 " 
                , "Gm7 ", "C7 ", "F Dm7 ", "Gm7 C7"),
                "F",
                "Blues For Alice",
                "https://www.youtube.com/watch?v=UtdzMfSwXi8",
                "C. Parker")

        saveSheetAndStandard(arrayOf("G ", "G ", "Gm7 ", "C7 ", "F ", "F ", "Fm7 ", "Bb7 " 
                , "Eb7 ", "Am7b5 D7 ", "Gm7 ", "D79 ", "Bm7 ", "E7 ", "Am7 ", "D7" 
                , "G ", "G ", "Gm7 ", "C7 ", "F ", "F ", "Fm7 ", "Bb7 " 
                , "Eb7 ", "Am7b5 D7 ", "G ", "G ", "Bm7 E7", "Am7 D7", "G E7 ", "Am7 D7"),
                "G",
                "Ornithology",
                "https://www.youtube.com/watch?v=QfuCZQagz2A",
                "C. Parker")

        saveSheetAndStandard(arrayOf("Bb ", "Bb ", "Bbm7 ", "Bbm7 ", "F ", "E7 ", "F ", "F " 
                , "D7 ", "D7 ", "D7 ", "D7 ", "G7 ", "G7 ", "Gm7 ", "C7 " 
                , "Bb ", "Bb ", "Bbm7 ", "Bbm7 ", "F ", "E7 ", "F ", "F " 
                , "D7 ", "D7 ", "A7 ", "Dm7 ", "Bb BO", "C7 ", "F ", "F7"),
                "F",
                "I'll See You In My Dreams",
                "https://www.youtube.com/watch?v=zlu1HS_pQp8",
                "I. Jones")

        saveSheetAndStandard(arrayOf("Gm7 ", "Gm7 ", "Eb7 D7 ", "Gm7 ", "C7 ", "F7 ", "Bb ", "D7 " 
                , "Gm7 ", "Gm7 ", "Eb7 D7 ", "Gm7 ", "C7 ", "F7 ", "Bb ", "Bb " 
                , "Fm7 ", "Bb7 ", "Eb ", "Eb ", "Gm7 ", "C7 ", "F ", "D7 " 
                , "Gm7 ", "Gm7 ", "Eb7 D7 ", "Gm7 ", "C7 ", "F7 ", "Bb ", "D7"),
                "Gm",
                "It Don't Mean A Thing",
                "https://www.youtube.com/watch?v=jvxPVK4ISVk",
                "D. Ellington")

    }

    fun saveSheetAndStandard(chords: Array<String>, key: String, name: String, video: String, author:
        String) {
        var sheet = Sheet(chords, key)
        var standard = Standard(name, sheet, video, author)

        standardsService.createStandard(standard)
    }
}
