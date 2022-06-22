package com.architecture.clean.entities

import java.time.LocalDateTime

data class ProductEntity (

    var id: Long? = null,
    var name: String,
    var description: String,
    val createDate: LocalDateTime = LocalDateTime.now()
        )