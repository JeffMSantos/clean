package com.architecture.clean.drivers.repository

import com.architecture.clean.drivers.BaseDao
import com.architecture.clean.entities.Product

interface IProductRepository: BaseDao<Product, Long> {
}