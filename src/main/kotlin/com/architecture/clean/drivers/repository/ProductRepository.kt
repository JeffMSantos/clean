package com.architecture.clean.drivers.repository

import com.architecture.clean.drivers.repository.base.BaseDao
import com.architecture.clean.drivers.repository.domain.Product

interface ProductRepository: BaseDao<Product, Long> {
}