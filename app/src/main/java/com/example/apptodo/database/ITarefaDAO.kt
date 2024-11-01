package com.example.apptodo.database

import com.example.apptodo.model.Tarefa

interface ITarefaDAO {
    fun salvar( tarefa: Tarefa ): Boolean
    fun atualizar( tarefa: Tarefa ): Boolean
    fun deletar( idTarefa: Int ): Boolean
    fun listar(): List<Tarefa>
}