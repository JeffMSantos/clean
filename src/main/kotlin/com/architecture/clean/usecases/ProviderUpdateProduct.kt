package com.architecture.clean.usecases

import com.architecture.clean.entities.ProductEntity

interface ProviderUpdateProduct {
    fun update(entity: ProductEntity): ProductEntity
}