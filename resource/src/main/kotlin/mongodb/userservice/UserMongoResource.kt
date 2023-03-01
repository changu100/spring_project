package mongodb.userservice

import mongodb.userservice.document.UserMongoRepository


interface UserResource

data class UserData (
    val userId: String
)

class UserMongoResource(private val userMongoRepository: UserMongoRepository):UserResource {
    fun findById(id:String):String{
        val result = userMongoRepository.findById(id)
        return "data"
    }
}