package github.luthfipun.springbootretrofit.controller

import github.luthfipun.springbootretrofit.domain.model.WebResponse
import github.luthfipun.springbootretrofit.error.ResponseException
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class ErrorController {

    @ResponseStatus(value = HttpStatus.SERVICE_UNAVAILABLE)
    @ExceptionHandler(value = [ResponseException::class])
    fun responseErrorHandler(responseException: ResponseException): WebResponse<Nothing> {
        return WebResponse(message = responseException.message.orEmpty())
    }
}