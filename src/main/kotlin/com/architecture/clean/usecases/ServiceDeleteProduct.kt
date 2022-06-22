package com.architecture.clean.usecases

import org.springframework.stereotype.Service

@Service
class ServiceDeleteProduct(private val providerDeleteProduct: ProviderDeleteProduct) {

    fun execute(id: Long){
        return providerDeleteProduct.delete(id);
    }
}