package com.example.apptodo.api

import com.example.apptodo.model.Categoria
import retrofit2.Response

class Repository {
    suspend fun listCategoria(): Response<List<Categoria>>{
        return RetrofitInstance.api.listCategoria()
    }
}