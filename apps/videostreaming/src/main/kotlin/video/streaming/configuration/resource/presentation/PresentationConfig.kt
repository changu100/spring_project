package video.streaming.configuration.resource.presentation

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import video.streaming.rest.VideoRestController

@Configuration
@Import(value = [
    VideoRestController::class
])
class PresentationConfig {
}