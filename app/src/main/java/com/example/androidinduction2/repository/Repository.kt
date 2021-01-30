package com.example.androidinduction2.repository

import com.example.androidinduction2.model.MembersItem
import retrofit2.Callback

interface Repository {
    fun retrieveTeamMembers(teamName: String, callback: Callback<List<MembersItem>>)
    fun retrieveMember(login: String, callback: Callback<MembersItem>)
}