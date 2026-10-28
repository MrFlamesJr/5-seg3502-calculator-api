package seg3502.calculator_api.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("calculator")
class CalculatorController {
	@GetMapping("/add/{nombre1}/{nombre2}")
	fun add(@PathVariable nombre1: Double, @PathVariable nombre2: Double) = nombre1 + nombre2

	@GetMapping("/subtract/{nombre1}/{nombre2}")
	fun subtract(@PathVariable nombre1: Double, @PathVariable nombre2: Double) = nombre1 - nombre2

	@GetMapping("/multiply/{nombre1}/{nombre2}")
	fun multiply(@PathVariable nombre1: Double, @PathVariable nombre2: Double) = nombre1 * nombre2

	@GetMapping("/divide/{nombre1}/{nombre2}")
	fun divide(@PathVariable nombre1: Double, @PathVariable nombre2: Double) = nombre1 / nombre2
}
