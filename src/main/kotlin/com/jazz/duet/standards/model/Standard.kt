package com.jazz.duet.standards.model

import javax.persistence.*

@Entity
@Table(name="standard")
data class Standard(@Id @GeneratedValue(strategy = GenerationType.AUTO)
                    @Column(name="standard_id")
                    val standard_id: Long,
                    @Column(name="name")
                    val name: String,
                    @OneToOne
                    @JoinColumn(name = "sheet_id")
                    val sheet: Sheet,
                    @Column(name="video")
                    val video: String,
                    @Column(name="author")
                    val author: String)