package com.architecture.clean.usecases

import com.architecture.clean.entities.ProductEntity

interface ProviderListProduct {
    fun findAll(): List<ProductEntity>
}