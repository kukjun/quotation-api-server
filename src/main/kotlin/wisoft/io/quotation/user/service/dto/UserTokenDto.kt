package wisoft.io.quotation.user.service.dto

data class UserTokenDto(
    val accessToken: String,
    val refreshToken: String
) {
    // TODO : Entity 정보 기반으로 JWT 생성
//    companion object
//    fun from(entity: User): UserSigninDto = UserSigninDto(
//         User
//    )
}
