package com.turkcell.lyraapp.data.repository

import com.turkcell.lyraapp.domain.repository.LoginRepository
import kotlinx.coroutines.delay
import javax.inject.Inject

/**
 * Login işlemlerinin sahte (stub) implementasyonu.
 */
class LoginRepositoryImpl @Inject constructor() : LoginRepository {
    override suspend fun login(phoneNumber: String, password: String): Result<Unit> {
        // Ağ gecikmesini simüle et
        delay(1500)

        return if (phoneNumber.length >= 10 && password == "123456") {
            Result.success(Unit)
        } else {
            Result.failure(Exception("Telefon numarası veya şifre hatalı. (İpucu: şifre 123456)"))
        }
    }
}
