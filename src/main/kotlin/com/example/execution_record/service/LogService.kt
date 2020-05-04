package com.example.execution_record.service

import org.springframework.stereotype.Service
import com.example.execution_record.entity.ExecutionLog
import com.example.execution_record.form.CreateForm
import com.example.execution_record.repository.LogRepository


@Service
class LogService(private val logRepository: LogRepository){

    fun findAll() = logRepository.findAll()

    fun findById(id: Long) = logRepository.findById(id).orElse(null)

    fun delete(id: Long) = logRepository.deleteById(id)

    fun save(executionLog: ExecutionLog) = logRepository.save(executionLog)


}