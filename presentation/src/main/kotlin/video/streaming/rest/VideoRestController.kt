package video.streaming.rest

import mongodb.userservice.UserMongoResource
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import video.streaming.Prefix

@RestController
@RequestMapping("$Prefix/video")
class VideoRestController(val userMongoResource:UserMongoResource){
    @GetMapping
    fun getVideoPath(
        @RequestParam id: String
    ): String {
        return userMongoResource.findById(id)
    }
}