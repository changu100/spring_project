package video.streaming.configuration.resource.resource.mongo

import com.mongodb.client.MongoClients
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.core.env.Environment
import org.springframework.data.mongodb.MongoDatabaseFactory
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory

@Configuration
@Profile("!test")
class MongoDbConfig {
    private var env: Environment? = null

    @Autowired
    fun applicationStartupEnvironment(env: Environment?) {
        this.env = env
    }

    @Bean
    fun mongoDatabaseFactory(): MongoDatabaseFactory {
        return SimpleMongoClientDatabaseFactory(
            MongoClients.create(env?.getProperty("spring.data.mongodb.uri") ?: ""),
            env?.getProperty("spring.data.mongodb.database") ?: ""
        )
    }

    @Bean
    fun mongoTemplate(): MongoTemplate {
        return MongoTemplate(
            mongoDatabaseFactory()
        )
    }
}