package com.example.execution_record.form

import jdk.jfr.DataAmount
import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDate
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

class CreateForm{
    @NotBlank
    var content: String = ""

    var genre: String = ""

    val reason: String? = ""

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    var writeData: LocalDate? = null
}