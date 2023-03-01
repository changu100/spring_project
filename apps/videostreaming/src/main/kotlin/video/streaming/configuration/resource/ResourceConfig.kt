package video.streaming.configuration.resource

import mongodb.userservice.UserMongoResource
import mongodb.userservice.UserResource
import mongodb.userservice.document.UserMongoRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import video.streaming.configuration.resource.user.UserServiceConfig
import video.streaming.rest.VideoRestController

@Configuration
@Import(value = [
    UserMongoRepository::class,
    UserServiceConfig::class
])
class ResourceConfig