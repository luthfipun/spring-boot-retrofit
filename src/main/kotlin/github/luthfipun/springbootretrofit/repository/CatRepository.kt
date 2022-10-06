package github.luthfipun.springbootretrofit.repository

import github.luthfipun.springbootretrofit.domain.model.CatResponse
import github.luthfipun.springbootretrofit.domain.model.WebResponse

interface CatRepository {
    suspend fun getCat(): WebResponse<CatResponse>
}