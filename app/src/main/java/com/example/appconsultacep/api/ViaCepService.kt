package com.example.appconsultacep.api

import com.example.appconsultacep.model.ResponseApi
import retrofit2.http.GET
import retrofit2.http.Path

interface ViaCepService {
    @GET("ws/{cep}/json/")
    suspend fun buscarCep(
        @Path("cep") cep: String
    ): ResponseApi
}