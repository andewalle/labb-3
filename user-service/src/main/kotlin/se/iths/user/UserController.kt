package se.iths.user

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController("user")
class UserController(private val userService: UserServiceImpl) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun createUser(@RequestBody req: CreateUserRequest): User = userService.createUser(req)

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun getUser(@PathVariable id: Long): User = userService.getUser(id)

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    fun updateUser(@PathVariable id: Long): User = userService.updateUser(id)

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    fun deleteUser(@PathVariable id: Long): User = userService.deleteUser(id)

}