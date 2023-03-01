package video.streaming.configuration.resource.user

import mongodb.userservice.UserMongoResource
import mongodb.userservice.UserResource
import mongodb.userservice.document.UserMongoRepository
import org.springframework.context.annotation.Bean

class UserServiceConfig {
    @Bean
    fun setUserMongoResource(
        userMongoRepository: UserMongoRepository
    ): UserResource {
        return UserMongoResource(userMongoRepository)
    }
}