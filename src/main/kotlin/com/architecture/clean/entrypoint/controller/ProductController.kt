package com.architecture.clean.entrypoint.controller

import com.architecture.clean.entrypoint.controller.mapper.MapperProductToResponse
import com.architecture.clean.entrypoint.controller.mapper.MapperRequestToProduct
import com.architecture.clean.entrypoint.controller.dto.ProductRequest
import com.architecture.clean.entrypoint.controller.dto.ProductResponse
import com.architecture.clean.usecases.*
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.util.UriBuilder
import org.springframework.web.util.UriComponentsBuilder

@RestController
@RequestMapping("/products")
class ProductController(
    private val serviceSaveProduct: ServiceSaveProduct,
    private val serviceListProduct: ServiceListProduct,
    private val serviceFindByIdProduct: ServiceFindByIdProduct,
    private val serviceUpdateProduct: ServiceUpdateProduct,
    private val serviceDeleteProduct: ServiceDeleteProduct,
    private val mapperProductToResponse: MapperProductToResponse,
    private val mapperRequestToProduct: MapperRequestToProduct
) {

    @GetMapping
    fun list() : List<ProductResponse> {
        val products = serviceListProduct.execute();
        return products.map { p -> mapperProductToResponse.map(p) }
    }

    @PostMapping
    fun save(@RequestBody request: ProductRequest, uriComponentsBuilder: UriComponentsBuilder): ResponseEntity<ProductResponse> {
        val product = mapperRequestToProduct.map(request);
        serviceSaveProduct.execute(product);
        val uri = uriComponentsBuilder.path("/products/${product.id}").build().toUri()
        return ResponseEntity.created(uri).body(mapperProductToResponse.map(product))
    }

    @GetMapping("/{id}")
    fun findById(@PathVariable id: Long): ProductResponse {
        val product = serviceFindByIdProduct.execute(id);
        return mapperProductToResponse.map(product);
    }

    @PutMapping
    fun update(@RequestBody request: ProductRequest): ResponseEntity<ProductResponse> {
        val product = mapperRequestToProduct.map(request);
        serviceUpdateProduct.execute(product)
        return ResponseEntity.ok(mapperProductToResponse.map(product));
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun delete(@PathVariable id: Long) {
        serviceDeleteProduct.execute(id)
    }
}