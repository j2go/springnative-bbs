package cloud.springnative.bbs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@SpringBootApplication
class BbsApplication

fun main(args: Array<String>) {
    runApplication<BbsApplication>(*args)
}

@Controller
class IndexController {
    @GetMapping("/")
    fun index() = "Hello SpringNative"
}