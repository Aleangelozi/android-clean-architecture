package com.aleangelozi.core.repository

class Repository(private val datasource: Datasource) {
    suspend fun getAllCharacters() = datasource.getAll()
}