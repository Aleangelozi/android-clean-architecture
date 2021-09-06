package com.aleangelozi.core.repository

import com.aleangelozi.core.data.Character

interface Datasource {
    suspend fun getAll(): List<Character>
}