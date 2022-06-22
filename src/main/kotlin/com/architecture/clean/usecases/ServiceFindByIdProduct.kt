package com.architecture.clean.usecases

import com.architecture.clean.entities.ProductEntity
import org.springframework.stereotype.Service

@Service
class ServiceFindByIdProduct(private val providerFindByIdProduct: ProviderFindByIdProduct) {

    fun execute(id: Long): ProductEntity{
        return providerFindByIdProduct.findById(id);
    }
}