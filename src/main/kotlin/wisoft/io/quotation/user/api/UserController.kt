package wisoft.io.quotation.user.api

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import wisoft.io.quotation.user.api.request.UserSigninRequest
import wisoft.io.quotation.user.api.response.UserSigninResponse
import wisoft.io.quotation.user.service.UserService

@RestController("users")
class UserController(
    private val userService: UserService,
) {

    @PostMapping("/signin")
    fun signin(@RequestBody request: UserSigninRequest): ResponseEntity<UserSigninResponse> {
        val userToken = userService.signin(request)

        return ResponseEntity.ok().body(UserSigninResponse.from(userToken))
    }


}