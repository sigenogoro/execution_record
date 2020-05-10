package com.example.execution_record.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import com.example.execution_record.entity.ExecutionLog


@Repository
interface LogRepository: JpaRepository<ExecutionLog, Long>{
}