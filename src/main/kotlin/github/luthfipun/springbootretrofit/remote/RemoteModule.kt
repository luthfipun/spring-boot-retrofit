package github.luthfipun.springbootretrofit.remote

import github.luthfipun.springbootretrofit.domain.util.AppProperties
import github.luthfipun.springbootretrofit.service.CatService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Configuration
class RemoteModule {

    @Bean
    fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().apply {
            HttpLoggingInterceptor.Level.BODY
        }
    }

    @Bean
    fun provideOkHttpClient(
        httpLoggingInterceptor: HttpLoggingInterceptor
    ): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(httpLoggingInterceptor)
            .build()
    }

    @Bean
    fun provideRetrofit(
        okHttpClient: OkHttpClient,
        appProperties: AppProperties
    ): Retrofit {
        return Retrofit.Builder()
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(appProperties.baseURL)
            .build()
    }

    @Bean
    fun provideRemoteService(retrofit: Retrofit): CatService {
        return retrofit.create(CatService::class.java)
    }
}