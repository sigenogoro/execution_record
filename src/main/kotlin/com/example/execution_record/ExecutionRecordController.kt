package com.example.execution_record

import com.example.execution_record.form.CreateForm
import com.example.execution_record.entity.ExecutionLog
import com.example.execution_record.entity.GenreGroup
import com.example.execution_record.form.CreateGenreForm

import com.example.execution_record.service.GenreService
import com.example.execution_record.service.LogService
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.validation.BindingResult
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import javax.annotation.PostConstruct


@Controller
class ExecutionRecordController(private val logService: LogService, private val genreService: GenreService) {

    @GetMapping("")
    fun index(model: Model): String {
        val executionHistory = logService.findAll()

        model.addAttribute("datas", executionHistory)
        return "index"
    }

    @GetMapping("/new")
    fun new(model: Model): String{
        model.addAttribute("CreateForm", CreateForm())
        model.addAttribute("GenreTypes", genreService.findAll())
        return "new"
    }

    @GetMapping("/newgenre")
    fun newGenre(model: Model): String{
        model.addAttribute("CreateGenreForm", CreateGenreForm())
        return "newgenre"
    }

    @PostMapping("/create")
    fun create(@Validated  @ModelAttribute("CreateForm") CreateForm: CreateForm,bindingResult: BindingResult ,executionLog: ExecutionLog, model: Model): String {
        if(bindingResult.hasErrors()){
            return "new"
        }
        logService.save(executionLog)
        return "redirect:/"
    }

    @PostMapping("/genreCreate")
    fun genreCreate(genreGroup: GenreGroup, model: Model): String {

        if(genreService.findByName(genreGroup.name)) {
            model.addAttribute("CreateGenreForm", CreateGenreForm())
            return "newgenre"
        }
        genreService.save(genreGroup)
        return "redirect:/"
    }

    @GetMapping("/edit/{id}")
    fun edit(@PathVariable id:Long,model: Model): String{
        val executionEdit = logService.findById(id)
        model.addAttribute("edida", executionEdit)
        return "edit"
    }

    @PostMapping("/update/{id}")
    fun update(@Validated @ModelAttribute("edida") edita: ExecutionLog, bindingResult: BindingResult ,@PathVariable id:Long, model: Model): String{

        if(bindingResult.hasErrors()){
            return "edit"
        }
        logService.save(edita.copy(id=id))

        return "redirect:/"
    }


    @PostMapping("/delete/{id}")
    fun delete(@PathVariable id: Long): String{
        logService.delete(id)
        return "redirect:/"
    }
}