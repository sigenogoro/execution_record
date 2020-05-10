package com.example.execution_record.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import com.example.execution_record.entity.GenreGroup

import org.springframework.data.repository.query.Param


@Repository
interface GenreRepository: JpaRepository<GenreGroup, Long>{

    fun existsByName(@Param("name") name: String?): Boolean

}