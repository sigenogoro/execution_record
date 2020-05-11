package com.example.execution_record.entity




import javax.persistence.Entity
import javax.persistence.*

@Entity

@Table(name = "genre_group")
data class GenreGroup(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,

        val name: String? = ""



)

