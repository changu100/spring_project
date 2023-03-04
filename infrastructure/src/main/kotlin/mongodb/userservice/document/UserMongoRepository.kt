package mongodb.userservice.document

import org.springframework.data.mongodb.repository.MongoRepository
import java.util.*

interface UserMongoRepository : MongoRepository<UserDocument,String>{
    fun findByUserId(id:String): UserDocument
}