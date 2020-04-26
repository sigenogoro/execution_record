package com.example.execution_record.service

import org.springframework.stereotype.Service
import com.example.execution_record.entity.ExecutionLog
import com.example.execution_record.repository.LogRepository

@Service
class LogService(private val logRepository: LogRepository){
}