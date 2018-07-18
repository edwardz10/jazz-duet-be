package com.jazz.duet.standards.model

import javax.persistence.*

@Entity
@Table(name="standard")
class Standard {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="standard_id")
    var standard_id: Long? = null

    @Column(name="name")
    var name: String? = null

    @OneToOne
    @JoinColumn(name = "sheet_id")
    var sheet: Sheet = Sheet()

    @Column(name="video")
    var video: String? = null

    @Column(name="author")
    var author: String? = null

    constructor() {}

    constructor(name: String, sheet: Sheet, video: String, author: String) {
        this.name = name
        this.sheet = sheet
        this.video = video
        this.author = author
    }
}