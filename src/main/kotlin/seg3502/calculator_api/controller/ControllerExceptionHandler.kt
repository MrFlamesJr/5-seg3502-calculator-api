package seg3502.calculator_api.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException

@RestControllerAdvice
class ControllerExceptionHandler {
	@ExceptionHandler(MethodArgumentTypeMismatchException::class)
	fun handleBadNumber(ex: MethodArgumentTypeMismatchException): ResponseEntity<String> =
		ResponseEntity.badRequest().body("'${ex.value}' is not a valid number for ${ex.name}")
}
