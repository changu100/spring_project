package video.streaming.configuration.resource.resource.mongo

import com.mongodb.client.MongoClients
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import
import org.springframework.context.annotation.Profile
import org.springframework.data.mongodb.MongoDatabaseFactory
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory


@Configuration
@Profile("!test")
class MongoDbConfig() {

    @Bean
    fun mongoDatabaseFactory(): MongoDatabaseFactory {
        return SimpleMongoClientDatabaseFactory(
            MongoClients.create(),
            ""
        )
    }

    @Bean
    fun mongoTemplate(): MongoTemplate {
        return MongoTemplate(mongoDatabaseFactory())
    }

}