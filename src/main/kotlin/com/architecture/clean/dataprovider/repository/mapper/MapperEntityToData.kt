package com.architecture.clean.dataprovider.repository.mapper

import com.architecture.clean.dataprovider.repository.domain.Product
import com.architecture.clean.entities.ProductEntity
import org.springframework.stereotype.Component

@Component
class MapperEntityToData {

    fun map(t: ProductEntity): Product {
        return Product(
            id = t.id,
            name = t.name,
            description = t.description
        )
    }
}