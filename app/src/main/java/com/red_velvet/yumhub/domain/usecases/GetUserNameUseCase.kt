package com.red_velvet.yumhub.domain.usecases

import com.red_velvet.yumhub.data.repositories.UserRepositoryImpl
import javax.inject.Inject

class GetUserNameUseCase @Inject constructor(
    private val repository: UserRepositoryImpl
) {

    suspend operator fun invoke() {
        repository.getUserName()
    }
}