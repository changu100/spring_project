package geekextension

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication()
class GeekExtensionSpringApplication

fun main(args: Array<String>) {
    runApplication<GeekExtensionSpringApplication>(*args)
}

@RestController
@RequestMapping("/health")
class LifeCycleController {
    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    fun health() {
    }
}