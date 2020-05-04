package com.example.execution_record.form


import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDate
import javax.validation.constraints.NotBlank


class CreateForm{
    @NotBlank
    var content: String = ""

    var genre: String = ""

    val reason: String? = ""

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    var writeData: LocalDate? = null
}