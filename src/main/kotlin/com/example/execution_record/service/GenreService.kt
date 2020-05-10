package com.example.execution_record.service

import org.springframework.stereotype.Service
import com.example.execution_record.entity.GenreGroup
import com.example.execution_record.repository.GenreRepository
import org.hibernate.type.TrueFalseType


@Service
class GenreService(private val genreRepository: GenreRepository){

    fun findAll() = genreRepository.findAll()


    fun delete(id: Long) = genreRepository.deleteById(id)

    fun save(genreGroup: GenreGroup) = genreRepository.save(genreGroup)


    fun validateGenre(name: String?) = genreRepository.existsByName(name)


    fun findById(id: Long) = genreRepository.findById(id)


}