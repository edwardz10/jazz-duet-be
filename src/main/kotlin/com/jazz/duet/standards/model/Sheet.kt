package com.jazz.duet.standards.model

import javax.persistence.*

@Entity
@Table(name="sheet")
data class Sheet(@Id @GeneratedValue(strategy = GenerationType.AUTO)
                 @Column(name="sheet_id")
                 val sheet_id: Long,
                 @Column(name="chords")
                 val chords: String,
                 @Column(name="melody_key")
                 val key: String)