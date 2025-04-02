package ttv.yazqen.bar.model.dto

import org.springframework.http.HttpStatus

class ErrorResponse (
    val status: HttpStatus,
    exception: RuntimeException
) {
    val code = status.value()
    val message = exception.message
    val cause = exception.javaClass
}