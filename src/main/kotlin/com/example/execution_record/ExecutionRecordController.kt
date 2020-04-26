package com.example.execution_record

import com.example.execution_record.form.CreateForm
import com.example.execution_record.entity.ExecutionLog
import com.example.execution_record.service.LogService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PostMapping


@Controller
class ExecutionRecordController(private val logService: LogService) {

    @GetMapping("")
    fun index(model: Model): String {
        val executionHistory = logService.findAll()

        model.addAttribute("data", executionHistory)
        return "index"
    }

    @GetMapping("/new")
    fun new(model: Model): String{
        model.addAttribute("CreateForm", CreateForm())
        return "new"
    }

    @PostMapping("/create")
    fun create(@Validated  @ModelAttribute("CreateForm") CreateForm: CreateForm,bindingResult: BindingResult ,executionLog: ExecutionLog, model: Model): String {
        println(CreateForm.content)
        if(bindingResult.hasErrors()){
            return "new"
        }
        logService.save(executionLog)
        return "redirect:/"
    }
}