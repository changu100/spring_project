package video.streaming.configuration.resource.resource

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import video.streaming.configuration.resource.resource.user.UserServiceConfig

@Configuration
@Import(value = [
    UserServiceConfig::class
])
class ResourceConfig