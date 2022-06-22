package com.architecture.clean.dataprovider.repository.base

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.NoRepositoryBean

@NoRepositoryBean
interface BaseDao<T, ID>: JpaRepository<T, ID> {
}