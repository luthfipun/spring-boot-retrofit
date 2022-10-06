package github.luthfipun.springbootretrofit.domain.entity

data class Cat(
    val id: String,
    val createdAt: String,
    val tags: List<String>,
    val url: String
)
