package wisoft.io.quotation.user.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import java.sql.Timestamp

@Entity(name = "app_user")
class User(
    @Id
    var id: String,
    @Column
    var password: String,
    @Column(unique = true)
    var nickname: String,
) {
    @CreatedDate
    @Column
    var createdAt: Timestamp? = null

    @LastModifiedDate
    @Column
    var lastModifiedAt: Timestamp? = null

    @Column
    var profilePath: String? = null

    @Column
    var alarm: Boolean? = true

}