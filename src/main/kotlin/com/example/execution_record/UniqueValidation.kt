package com.example.execution_record

//
//import com.example.execution_record.service.GenreService
//import javax.validation.*
//import kotlin.reflect.KClass
//
//@Target(AnnotationTarget.FIELD)
//@Retention(AnnotationRetention.RUNTIME)
//@MustBeDocumented
//@ReportAsSingleViolation
//@Constraint(validatedBy = [CanSplitBySpaceValidator::class])
//
//annotation class CanSplitBySpace(
//        val message: String = "message",
//        val groups: Array<KClass<out Any>> = [],
//        val payload: Array<KClass<out Payload>> = []
//)
//
//class CanSplitBySpaceValidator: ConstraintValidator<CanSplitBySpace, String> {
//    override fun initialize(constraintAnnotation: CanSplitBySpace) {}
//
//    override fun isValid(value: String?, context: ConstraintValidatorContext?): Boolean {
//
//        println(value)
//        return false
//    }
//}