package se.iths.user

import java.lang.RuntimeException

class ResourceNotFoundException(override val message: String): RuntimeException(message) {
}