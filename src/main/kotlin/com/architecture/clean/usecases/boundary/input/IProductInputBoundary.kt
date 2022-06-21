package com.architecture.clean.usecases.boundary.input

import com.architecture.clean.usecases.dto.ProductRequestModel
import com.architecture.clean.usecases.dto.ProductResponseModel
import org.springframework.http.ResponseEntity

interface IProductInputBoundary {

    fun findAll(): List<ProductResponseModel>
    abstract fun save(request: ProductRequestModel): ProductResponseModel
}