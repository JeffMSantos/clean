package com.architecture.clean.usecases.mapper

import com.architecture.clean.entities.Product
import com.architecture.clean.usecases.dto.ProductResponseModel
import org.springframework.stereotype.Component

@Component
class ProductToResponseMapper: Mapper<Product, ProductResponseModel>{

    override fun map(t: Product): ProductResponseModel {
        return ProductResponseModel(
            id = t.id,
            name = t.name,
            description = t.description,
            createDate = t.createDate
        )
    }
}