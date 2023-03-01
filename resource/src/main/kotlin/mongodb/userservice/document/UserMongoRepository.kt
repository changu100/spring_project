package mongodb.userservice.document

import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserMongoRepository : MongoRepository<UserDocument,String>{
    override fun findById(id:String): Optional<UserDocument>
}