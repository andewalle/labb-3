package se.iths.user

class UpdateUserRequest (

    val email: String? = null,
    val address: String? = null,
    val phoneNumber: Int? = null,
    val username: String,
    val password: String

)