package com.architecture.clean.usecases

import com.architecture.clean.entities.ProductEntity
import org.springframework.stereotype.Service

@Service
class ServiceListProduct(private val providerListProduct: ProviderListProduct) {

    fun execute(): List<ProductEntity> {
        return providerListProduct.findAll();
    }
}