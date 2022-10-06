package github.luthfipun.springbootretrofit.controller

import github.luthfipun.springbootretrofit.domain.model.CatResponse
import github.luthfipun.springbootretrofit.domain.model.WebResponse
import github.luthfipun.springbootretrofit.repository.CatRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1")
class CatController(
    val catRepository: CatRepository
) {

    @GetMapping(
        value = ["cat"],
        produces = ["application/json"]
    )
    suspend fun cat(): WebResponse<CatResponse> {
        return catRepository.getCat()
    }
}