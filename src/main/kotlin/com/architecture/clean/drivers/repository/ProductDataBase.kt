package com.architecture.clean.drivers.repository

import com.architecture.clean.usecases.dto.ProductRequestModel
import com.architecture.clean.usecases.dto.ProductResponseModel
import com.architecture.clean.usecases.mapper.ProductToResponseMapper
import com.architecture.clean.usecases.mapper.RequestToProductMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class ProductDataBase(private val productToResponseMapper: ProductToResponseMapper, private val requestToProductMapper: RequestToProductMapper) {

    @Autowired
    private lateinit var repository: IProductRepository

    fun findAll(): List<ProductResponseModel> {
        val products = repository.findAll();
        return products.map { p -> productToResponseMapper.map(p) }
    }

    fun save(request: ProductRequestModel): ProductResponseModel {
        val product = requestToProductMapper.map(request);
        repository.save(product);
        return productToResponseMapper.map(product);
    }
}