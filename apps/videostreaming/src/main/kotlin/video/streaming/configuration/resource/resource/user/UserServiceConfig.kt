package video.streaming.configuration.resource.resource.user

import mongodb.userservice.UserMongoResource
import mongodb.userservice.UserResource
import mongodb.userservice.document.UserMongoRepository
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories



@Configuration
@EnableMongoRepositories(
    basePackageClasses = [
        UserMongoRepository::class,
    ]
)
class UserServiceConfig{
    @Bean
    fun setUserMongoResource(
        userMongoRepository: UserMongoRepository
    ): UserResource {
        return UserMongoResource(userMongoRepository)
    }
}