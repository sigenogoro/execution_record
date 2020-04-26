package com.example.execution_record.entity



import org.springframework.format.annotation.DateTimeFormat
import javax.validation.constraints.*
import java.time.LocalDate
import javax.persistence.*


@Entity
@Table(name = "execution_log")

data class ExecutionLog(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long? = null,

        @NotBlank
        val content: String = "",

        val reason: String = "",

        val genre: String? = "",

        @DateTimeFormat(pattern = "yyyy-MM-dd")
        val writeData: LocalDate? = null
)


