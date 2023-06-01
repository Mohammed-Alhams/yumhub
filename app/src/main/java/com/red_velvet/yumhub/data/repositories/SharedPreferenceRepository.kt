package com.red_velvet.yumhub.data.repositories

import com.red_velvet.yumhub.data.remote.dtos.auth.UserInformation

interface SharedPreferenceRepository {

    suspend fun saveUserName(userData: UserInformation)
    suspend fun getUserName(): String
    suspend fun getHash(): String

}