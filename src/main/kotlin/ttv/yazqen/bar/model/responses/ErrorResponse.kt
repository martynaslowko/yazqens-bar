package ttv.yazqen.bar.model.responses

import org.springframework.http.HttpStatus
import java.time.Instant

class ErrorResponse (
    val status: HttpStatus,
    exception: RuntimeException
) {
    val timestamp = Instant.now()
    val code = status.value()
    val message = exception.message
    val cause = exception.javaClass
}