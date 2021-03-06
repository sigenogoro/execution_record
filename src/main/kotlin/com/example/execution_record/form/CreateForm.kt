package com.example.execution_record.form


import com.example.execution_record.entity.GenreGroup

import org.springframework.format.annotation.DateTimeFormat
import java.time.LocalDate
import javax.validation.constraints.NotBlank


class CreateForm(){
    @NotBlank
    var content: String = ""

    var genre: GenreGroup = GenreGroup()

    val reason: String? = ""

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    var writeData: LocalDate? = null


}