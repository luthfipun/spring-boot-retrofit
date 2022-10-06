package github.luthfipun.springbootretrofit.domain.mapper

import github.luthfipun.springbootretrofit.domain.entity.Cat
import github.luthfipun.springbootretrofit.domain.model.CatResponse
import github.luthfipun.springbootretrofit.remote.model.CatRemoteResponse

fun CatRemoteResponse.toCat(): Cat {
    return Cat(
        id = id, createdAt = createdAt, tags = tags, url = url
    )
}

fun Cat.toCatResponse(): CatResponse {
    return CatResponse(
        id = id, created_at = createdAt, tags = tags, url = url
    )
}