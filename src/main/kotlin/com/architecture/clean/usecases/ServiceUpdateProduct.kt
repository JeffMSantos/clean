package com.architecture.clean.usecases

import com.architecture.clean.entities.ProductEntity
import org.springframework.stereotype.Service

@Service
class ServiceUpdateProduct(
    private val providerUpdateProduct: ProviderUpdateProduct,
    private val providerFindByIdProduct: ProviderFindByIdProduct
) {

    fun execute(entity: ProductEntity): ProductEntity {

        val product = providerFindByIdProduct.findById(entity.id)

        product.name = entity.name
        product.description = entity.description

        return providerUpdateProduct.update(product);
    }
}