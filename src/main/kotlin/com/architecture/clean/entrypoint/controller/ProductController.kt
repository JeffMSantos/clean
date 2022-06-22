package com.architecture.clean.entrypoint.controller

import com.architecture.clean.entrypoint.controller.mapper.MapperProductToResponse
import com.architecture.clean.entrypoint.controller.mapper.MapperRequestToProduct
import com.architecture.clean.entrypoint.controller.dto.ProductRequest
import com.architecture.clean.entrypoint.controller.dto.ProductResponse
import com.architecture.clean.usecases.ServiceFindByIdProduct
import com.architecture.clean.usecases.ServiceListProduct
import com.architecture.clean.usecases.ServiceSaveProduct
import com.architecture.clean.usecases.ServiceUpdateProduct
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/products")
class ProductController(
    private val serviceSaveProduct: ServiceSaveProduct,
    private val serviceListProduct: ServiceListProduct,
    private val serviceFindByIdProduct: ServiceFindByIdProduct,
    private val serviceUpdateProduct: ServiceUpdateProduct,
    private val mapperProductToResponse: MapperProductToResponse,
    private val mapperRequestToProduct: MapperRequestToProduct
) {

    @GetMapping
    fun list() : List<ProductResponse> {
        val products = serviceListProduct.execute();
        return products.map { p -> mapperProductToResponse.map(p) }
    }

    @PostMapping
    fun save(@RequestBody request: ProductRequest): ProductResponse {
        val product = mapperRequestToProduct.map(request);
        serviceSaveProduct.execute(product);
        return mapperProductToResponse.map(product);
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): ProductResponse {
        val product = serviceFindByIdProduct.execute(id);
        return mapperProductToResponse.map(product);
    }

    @PutMapping
    fun update(@RequestBody request: ProductRequest): ProductResponse {
        val product = mapperRequestToProduct.map(request);
        serviceUpdateProduct.execute(product)
        return mapperProductToResponse.map(product);
    }
}