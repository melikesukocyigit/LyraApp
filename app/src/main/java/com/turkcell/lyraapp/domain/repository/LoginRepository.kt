package com.turkcell.lyraapp.domain.repository

/**
 * Login işlemlerinden sorumlu repository arayüzü.
 */
interface LoginRepository {
    suspend fun login(phoneNumber: String, password: String): Result<Unit>
}
