package github.luthfipun.springbootretrofit.repository

import github.luthfipun.springbootretrofit.domain.mapper.toCat
import github.luthfipun.springbootretrofit.domain.mapper.toCatResponse
import github.luthfipun.springbootretrofit.domain.model.CatResponse
import github.luthfipun.springbootretrofit.domain.model.WebResponse
import github.luthfipun.springbootretrofit.error.ResponseException
import github.luthfipun.springbootretrofit.service.CatService
import org.springframework.stereotype.Repository

@Repository
class CatRepositoryImpl(
    val catService: CatService
) : CatRepository {
    override suspend fun getCat(): WebResponse<CatResponse> {
        val catService = catService.getCat(isJson = true)
        if (!catService.isSuccessful){
            throw ResponseException(catService.message())
        }

        val responseBody = catService.body()
        val cat = responseBody?.toCat()
        return WebResponse(data = cat?.toCatResponse())
    }
}