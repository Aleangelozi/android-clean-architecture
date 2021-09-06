package com.aleangelozi.core.usecase

import com.aleangelozi.core.repository.Repository

class GetAllCharacters(private val repository: Repository) {
    suspend operator fun invoke() = repository.getAllCharacters()
}