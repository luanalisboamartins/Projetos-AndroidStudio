package com.example.apptodo.model

data class Categoria(
    var id: Long,
    var descricao: String,
    var tarefa: List<Tarefa>?
) {

    override fun toString(): String {
        return descricao!!
    }
}