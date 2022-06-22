package com.architecture.clean.dataprovider.repository.product

import com.architecture.clean.dataprovider.repository.base.BaseDao
import com.architecture.clean.dataprovider.repository.domain.Product

interface ProductRepository: BaseDao<Product, Long> {
}