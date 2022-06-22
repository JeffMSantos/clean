package com.architecture.clean.adapters.controller.mapper

import com.architecture.clean.entities.ProductEntity
import com.architecture.clean.adapters.controller.dto.ProductRequest
import org.springframework.stereotype.Component

@Component
class MapperRequestToProduct {

    fun map(t: ProductRequest): ProductEntity {
        return ProductEntity(
            id = t.id,
            name = t.name,
            description = t.description
        )
    }
}