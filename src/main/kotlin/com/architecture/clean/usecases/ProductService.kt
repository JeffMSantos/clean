package com.architecture.clean.usecases

import com.architecture.clean.usecases.boundary.input.IProductInputBoundary
import com.architecture.clean.usecases.dto.ProductRequestModel
import com.architecture.clean.usecases.dto.ProductResponseModel
import org.springframework.stereotype.Service

@Service
class ProductService(private val inputBoundary: IProductInputBoundary)   {

    fun list(): List<ProductResponseModel> {
        return inputBoundary.findAll();
    }

    fun save(request: ProductRequestModel): ProductResponseModel {
        return inputBoundary.save(request);
    }
}