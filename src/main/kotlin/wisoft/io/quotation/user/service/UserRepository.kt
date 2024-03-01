package wisoft.io.quotation.user.service

import org.springframework.data.jpa.repository.JpaRepository
import wisoft.io.quotation.user.domain.User

interface UserRepository: JpaRepository<User, String> {

}