package com.example.androidinduction2.model

import com.google.gson.annotations.SerializedName

data class MembersItem(
        val name: String,
        val login: String,
        val company: String,
        val email: String,
        val type: String,
        @SerializedName("avatar_url") val avatarUrl: String,
        @SerializedName("public_repos") val publicRepos: Int
)
