package se.iths.user

import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(private val repository: UserRepository) : UserService {

    override fun createUser(request: CreateUserRequest): User {
        return User(
            request.email,
            request.address,
            request.phoneNumber,
            request.username,
            request.password
        )
    }

    override fun getUser(id: Long): User {
        return repository.findByIdOrNull(id).let { user ->
            user
        } ?: throw ResourceNotFoundException("User with id ${id} was not found")
    }

    override fun updateUser(id: Long, request: UpdateUserRequest): User {
        return User(
            request.email,
            request.address,
            request.phoneNumber,
            request.username,
            request.password
        )
    }

    override fun deleteUser(id: Long) {
        repository.deleteById(id)
    }

}