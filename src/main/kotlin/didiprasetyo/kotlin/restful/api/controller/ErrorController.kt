package didiprasetyo.kotlin.restful.api.controller

import didiprasetyo.kotlin.restful.api.error.NotFoundException
import didiprasetyo.kotlin.restful.api.error.UnauthorizedException
import didiprasetyo.kotlin.restful.api.model.WebResponse
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import javax.validation.ConstraintViolationException

@RestControllerAdvice
class ErrorController {

    @ExceptionHandler(value = [ConstraintViolationException::class])
    fun validationHandler(constraintViolationException: ConstraintViolationException): WebResponse<String>{
        return WebResponse(
            code = 400,
            status = "BAD REQUEST",
            data = constraintViolationException.message!!
        )
    }

    @ExceptionHandler(value = [NotFoundException::class])
    fun notFound(notFoundException: NotFoundException): WebResponse<String>{
        return WebResponse(
            code = 404,
            status = "NOT FOUND",
            data = "Not Found"
        )
    }

    @ExceptionHandler(value = [UnauthorizedException::class])
    fun unauthorized(unauthorizedException: UnauthorizedException): WebResponse<String>{
        return WebResponse(
            code = 401,
            status = "UNAUTHORIZED",
            data = "Please put your X-Api-Key"
        )
    }
}