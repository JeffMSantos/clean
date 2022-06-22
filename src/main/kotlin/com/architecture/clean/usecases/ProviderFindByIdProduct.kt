package com.architecture.clean.usecases

import com.architecture.clean.entities.ProductEntity

interface ProviderFindByIdProduct {
    fun findById(id: Long?): ProductEntity
}