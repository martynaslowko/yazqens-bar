package ttv.yazqen.bar.model.responses

import org.springframework.http.HttpStatus

class ErrorResponse (
    val status: HttpStatus,
    exception: RuntimeException
) {
    val code = status.value()
    val message = exception.message
    val cause = exception.javaClass
}