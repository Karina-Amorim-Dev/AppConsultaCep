package com.example.appconsultacep.model

data class ResponseApi(
    val logradouro : String,
    val bairro: String,
    val localidade: String,
    val uf: String,
    val ddd: String
)
