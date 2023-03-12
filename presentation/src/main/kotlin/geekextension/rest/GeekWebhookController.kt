package geekextension.rest

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import video.streaming.Prefix
import javax.servlet.http.HttpServletRequest

@RestController
@RequestMapping("$Prefix/geek-extension")
class GeekWebhookController {

    @PostMapping("/webhook")
    fun handleWebhook(request: HttpServletRequest, @RequestBody payload: Any) {
        // Process the webhook payload as required
        println("Received webhook request: $payload");
    }
}