package wisoft.io.quotation.user.service

import org.springframework.data.repository.findByIdOrNull
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service
import wisoft.io.quotation.user.api.request.UserSigninRequest
import wisoft.io.quotation.user.service.dto.UserTokenDto
import wisoft.io.quotation.user.util.JWTUtil
import kotlin.RuntimeException


@Service
class UserService(
    private val userRepository: UserRepository,
) {
    fun signin(request: UserSigninRequest): UserTokenDto {
        val user = userRepository.findByIdOrNull(request.id) ?: throw RuntimeException()

        val encoder = BCryptPasswordEncoder()
        val isMatch = encoder.matches(request.password, user.password)
        if(!isMatch) throw RuntimeException()

        val accessToken = JWTUtil.generateAccessToken(user)
        val refreshToken = JWTUtil.generateRefreshToken(user)

        return UserTokenDto(accessToken, refreshToken)

    }
}