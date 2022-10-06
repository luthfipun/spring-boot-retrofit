package github.luthfipun.springbootretrofit.domain.model

import org.springframework.http.HttpStatus

data class WebResponse<T>(
    val message: String = HttpStatus.OK.name,
    val data: T? = null
)
