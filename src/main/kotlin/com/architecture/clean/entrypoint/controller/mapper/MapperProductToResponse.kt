package com.architecture.clean.entrypoint.controller.mapper

import com.architecture.clean.entities.ProductEntity
import com.architecture.clean.entrypoint.controller.dto.ProductResponse
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