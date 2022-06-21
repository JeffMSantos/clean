package com.architecture.clean.drivers

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.repository.NoRepositoryBean

@NoRepositoryBean
interface BaseDao<T, ID>: JpaRepository<T, ID> {
}