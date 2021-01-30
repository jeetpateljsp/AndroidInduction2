package com.example.androidinduction2.repository.remote

import com.example.androidinduction2.model.MembersItem
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface GithubAPI {
    @GET("org/{org}/members")
    fun retrieveTeamMembers(@Path("org") teamName: String): Call<List<MembersItem>>

    @GET("users/{login}")
    fun retrieveMember(@Path("login") login: String): Call<MembersItem>
}