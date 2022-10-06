package github.luthfipun.springbootretrofit.domain.model

data class CatResponse(
    val id: String,
    val created_at: String,
    val tags: List<String>,
    val url: String
)
