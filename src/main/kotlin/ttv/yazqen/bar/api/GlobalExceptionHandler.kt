package ttv.yazqen.bar.api

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import ttv.yazqen.bar.model.responses.ErrorResponse
import ttv.yazqen.bar.service.CocktailNotFoundException


@ControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler(CocktailNotFoundException::class, NoSuchElementException::class)
    fun handleGlobalException(ex: RuntimeException): ResponseEntity<Any> {
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
            .body(ErrorResponse(HttpStatus.NOT_FOUND, ex))
    }

}