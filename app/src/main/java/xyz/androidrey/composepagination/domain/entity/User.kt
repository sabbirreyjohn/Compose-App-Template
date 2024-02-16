package xyz.androidrey.composepagination.domain.entity

import com.squareup.moshi.Json

data class User(
    @Json(name = "id") val userId: String,
    @Json(name = "login") val userName: String,
    @Json(name = "node_id") val nodeId: String,
    @Json(name = "avatar_url") val userAvatar: String
)