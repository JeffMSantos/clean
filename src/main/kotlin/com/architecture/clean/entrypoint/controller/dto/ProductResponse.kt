package com.architecture.clean.entrypoint.controller.dto

import java.time.LocalDateTime

data class ProductResponse (
    var id: Long? = null,
    var name: String,
    var description: String,
    var createDate: LocalDateTime
        )