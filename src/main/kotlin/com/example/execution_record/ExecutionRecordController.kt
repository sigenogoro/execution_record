package com.example.execution_record

import com.example.execution_record.service.LogService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class ExecutionRecordController(private val logService: LogService){

    @GetMapping("")
    fun index(model: Model) :String {
        var data = mutableListOf(listOf(1, "本のタイトル", false))
        data.add(listOf(2, "本のタイトル", false))
        data.add(listOf(3, "本のタイトル", false))
        println("Hllo World")

        model.addAttribute("bookdata", data)
        return "index"
    }
}