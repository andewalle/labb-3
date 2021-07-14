package se.iths.user

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
data class User (

        @Id @GeneratedValue
        val id: Long,
        val email: String? = null,
        var address: String? = null,
        var phoneNumber: Int? = null,
        var username: String,
        var password: String,

        )