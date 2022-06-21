package com.architecture.clean.adapters

import com.architecture.clean.usecases.boundary.input.IProductInputBoundary
import com.architecture.clean.usecases.dto.ProductRequestModel
import com.architecture.clean.usecases.dto.ProductResponseModel
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/products")
class ProductController(private val inputBoundary: IProductInputBoundary) {

    @GetMapping
    fun list() : List<ProductResponseModel> {
        return inputBoundary.findAll();
    }

    @PostMapping
    fun save(@RequestBody request: ProductRequestModel): ProductResponseModel {
        return inputBoundary.save(request);
    }
}