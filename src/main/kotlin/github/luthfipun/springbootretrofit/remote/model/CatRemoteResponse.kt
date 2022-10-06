package github.luthfipun.springbootretrofit.remote.model

import com.google.gson.annotations.SerializedName

data class CatRemoteResponse(
    @SerializedName("id")
    val id: String,
    @SerializedName("created_at")
    val createdAt: String,
    @SerializedName("tags")
    val tags: List<String>,
    @SerializedName("url")
    val url: String
)
