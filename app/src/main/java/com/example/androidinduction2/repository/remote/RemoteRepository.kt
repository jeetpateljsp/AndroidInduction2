package com.example.androidinduction2.repository.remote

import com.example.androidinduction2.model.MembersItem
import com.example.androidinduction2.repository.Repository
import retrofit2.Callback
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RemoteRepository : Repository {

    private val api: GithubAPI

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        api = retrofit.create<GithubAPI>(GithubAPI::class.java)
    }

    override fun retrieveTeamMembers(teamName: String, callback: Callback<List<MembersItem>>) {
        api.retrieveTeamMembers(teamName).enqueue(callback)
    }

    override fun retrieveMember(login: String, callback: Callback<MembersItem>) {
        api.retrieveMember(login).enqueue(callback)
    }
}