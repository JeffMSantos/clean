package com.architecture.clean.usecases


import com.architecture.clean.entities.ProductEntity
import org.springframework.stereotype.Service

@Service
class ServiceSaveProduct(private val providerSaveProduct: ProviderSaveProduct) {

    fun execute(entity: ProductEntity): ProductEntity {
        return providerSaveProduct.save(entity);
    }
}