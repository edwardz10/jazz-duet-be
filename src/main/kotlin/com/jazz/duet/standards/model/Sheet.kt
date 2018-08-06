package com.jazz.duet.standards.model

import javax.persistence.*

@Entity
@Table(name="sheet")
class Sheet {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="sheet_id")
    var sheet_id: Long? = null

    @Column(name="chords")
    var chords: Array<String> = emptyArray()

    @Column(name="melody_key")
    var key: String? = null

    constructor() {}

    constructor(chords: Array<String>, key: String) {
        this.chords = chords;
        this.key = key;
    }
}