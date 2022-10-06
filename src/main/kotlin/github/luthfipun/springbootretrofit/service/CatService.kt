package github.luthfipun.springbootretrofit.service

import github.luthfipun.springbootretrofit.remote.model.CatRemoteResponse
import org.springframework.stereotype.Service
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

@Service
interface CatService {
    @GET("cat")
    suspend fun getCat(
        @Query("json") isJson: Boolean
    ): Response<CatRemoteResponse>
}