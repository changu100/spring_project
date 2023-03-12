package geekextension.configuration.presentation

import geekextension.rest.GeekWebhookController
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Configuration
@Import(
    value = [
        GeekWebhookController::class
    ]
)
class PresentationSpringConfig
