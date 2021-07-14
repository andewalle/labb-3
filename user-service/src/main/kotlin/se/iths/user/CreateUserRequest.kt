package se.iths.user

class CreateUserRequest (

    val email: String? = null,
    val address: String? = null,
    val phoneNumber: Int? = null,
    val username: String,
    val password: String

)