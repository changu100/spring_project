package video.streaming.rest

import mongodb.userservice.UserData
import mongodb.userservice.UserResource
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import video.streaming.Prefix

@RestController
@RequestMapping("$Prefix/video")
class VideoRestController(private val userMongoResource:UserResource){
    @GetMapping
    fun getVideoPath(
        @RequestParam id: String
    ): UserData {
        return userMongoResource.findById(id)
    }
}