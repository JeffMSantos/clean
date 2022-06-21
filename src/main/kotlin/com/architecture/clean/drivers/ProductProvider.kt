package com.architecture.clean.drivers

import com.architecture.clean.drivers.repository.ProductDataBase
import com.architecture.clean.usecases.boundary.input.IProductInputBoundary
import com.architecture.clean.usecases.dto.ProductRequestModel
import com.architecture.clean.usecases.dto.ProductResponseModel
import org.springframework.stereotype.Component

@Component
class ProductProvider(private val dataBase: ProductDataBase) : IProductInputBoundary {

    override fun findAll(): List<ProductResponseModel> {
        return dataBase.findAll();
    }

    override fun save(request: ProductRequestModel): ProductResponseModel {
        return dataBase.save(request);
    }
}