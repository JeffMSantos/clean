package com.architecture.clean.dataprovider.repository.mapper

import com.architecture.clean.dataprovider.repository.domain.Product
import com.architecture.clean.entities.ProductEntity
import org.springframework.stereotype.Component

@Component
class MapperDataToEntity {

    fun map(t: Product): ProductEntity {
        return ProductEntity(
            id = t.id,
            name = t.name,
            description = t.description
        )
    }
}