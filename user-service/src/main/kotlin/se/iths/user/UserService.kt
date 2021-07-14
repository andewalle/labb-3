package se.iths.user

interface UserService {

    fun createUser(request: CreateUserRequest): User
    fun getUser(id: Long): User
    fun updateUser(id: Long): User
    fun deleteUser(id: Long)

}