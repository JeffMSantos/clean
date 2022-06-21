package com.architecture.clean.usecases.mapper

import com.architecture.clean.entities.Product
import com.architecture.clean.usecases.dto.ProductRequestModel
import org.springframework.stereotype.Component

@Component
class RequestToProductMapper: Mapper<ProductRequestModel, Product> {

    override fun map(t: ProductRequestModel): Product {
        return Product(
            name = t.name,
            description = t.description
        )
    }
}