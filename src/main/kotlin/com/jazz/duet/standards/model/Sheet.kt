package com.jazz.duet.standards.model

import javax.persistence.*

@Entity
@Table(name="sheet")
class Sheet {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="sheet_id")
    var sheet_id: Long? = null

    @Column(name="chords")
    var chords: String? = null
    @Column(name="melody_key")
    var key: String? = null

    constructor() {}

    constructor(chords: String, key: String) {
        this.chords = chords;
        this.key = key;
    }
}