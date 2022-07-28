package com.example.model

import java.util.Date
import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "confederation")
data class Confederation(
    @Id
    var id: UUID?=null,

    @Column(name = "name")
    var name: String,

    @Column(name = "president")
    var president: String,

    @Column(name = "locale")
    var locale: String,

    @Column(name = "createdAt")
    var createdAt: Date?=null,

    @Column(name = "updatedAt")
    var updatedAt: Date?=null
)