package com.architecture.clean.usecases.dto

import java.time.LocalDateTime

data class ProductResponseModel (
    var id: Long? = null,
    var name: String,
    var description: String,
    var createDate: LocalDateTime
        )