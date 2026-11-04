package seg3502.calculator_api.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException

@RestControllerAdvice
class ControllerExceptionHandler {
	@ExceptionHandler(MethodArgumentTypeMismatchException::class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	fun handleTypeMismatch(ex: MethodArgumentTypeMismatchException): ResponseEntity<String> {
		return ResponseEntity.badRequest()
			.body("'${ex.value}' is not a valid value for ${ex.name}")
	}

	@ExceptionHandler(IllegalArgumentException::class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	fun handleIllegalArgument(ex: IllegalArgumentException): ResponseEntity<String> {
		return ResponseEntity.badRequest()
			.body(ex.message ?: "Unable to process request")
	}
}
