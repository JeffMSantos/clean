package com.architecture.clean.dataprovider.repository.product

import com.architecture.clean.entrypoint.controller.mapper.MapperProductToResponse
import com.architecture.clean.entrypoint.controller.mapper.MapperRequestToProduct
import com.architecture.clean.dataprovider.repository.domain.Product
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class ProductDataBase(private val productToResponseMapper: MapperProductToResponse, private val requestToProductMapper: MapperRequestToProduct) {

    @Autowired
    private lateinit var repository: ProductRepository

    fun findAll(): List<Product> {
        return repository.findAll();
    }

    fun save(data: Product): Product {
        return repository.save(data);
    }

    fun findById(id: Long?): Product {
        return repository.findById(id!!).get();
    }

    fun delete(id: Long) {
        repository.deleteById(id)
    }
}