package wisoft.io.quotation.user.api.response

import wisoft.io.quotation.user.service.dto.UserTokenDto

data class UserSigninResponse(
    val accessToken: String,
    val refreshToken: String
) {
    companion object {
        fun from(dto: UserTokenDto): UserSigninResponse =
            UserSigninResponse(accessToken = dto.accessToken, refreshToken = dto.refreshToken)
    }
}