package com.architecture.clean.adapters.controller.mapper

import com.architecture.clean.entities.ProductEntity
import com.architecture.clean.adapters.controller.dto.ProductResponse
import org.springframework.stereotype.Component

@Component
class MapperProductToResponse {

    fun map(t: ProductEntity): ProductResponse {
        return ProductResponse(
            id = t.id,
            name = t.name,
            description = t.description,
            createDate = t.createDate
        )
    }
}