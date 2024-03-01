package wisoft.io.quotation.user.service

import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import wisoft.io.quotation.user.api.request.UserSigninRequest
import wisoft.io.quotation.user.service.dto.UserTokenDto
import java.lang.RuntimeException

@Service
class UserService(
    private val userRepository: UserRepository,
) {
    fun signin(request: UserSigninRequest): UserTokenDto {
        val user = userRepository.findByIdOrNull(request.id) ?: throw RuntimeException()
        // TODO : Password 알고리즘 적용 후 비교

        // TODO : 비교 완료 후, user 정보 기반으로 토큰 생성 후 반환

        // FIXME : 예비 반환 값을 실제 반환 값으로 변환
        return UserTokenDto("test", "test")

    }
}