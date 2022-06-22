package com.architecture.clean.usecases

import com.architecture.clean.entities.ProductEntity

interface ProviderSaveProduct {
    fun save(entity: ProductEntity): ProductEntity
}