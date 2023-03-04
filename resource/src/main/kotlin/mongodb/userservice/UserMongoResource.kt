package mongodb.userservice

import mongodb.userservice.document.UserMongoRepository

interface UserResource {
    fun findById(id: String): UserData
}

data class UserData (
    val userId: String
)

class UserMongoResource(private val userMongoRepository: UserMongoRepository):UserResource {
    override fun findById(id:String):UserData{
        try {
            val userDocument = userMongoRepository.findByUserId(id)
            return UserData(userId = userDocument.userId)
        }
        catch(e:Exception){
            throw Exception("ID not Found")
        }
    }
}