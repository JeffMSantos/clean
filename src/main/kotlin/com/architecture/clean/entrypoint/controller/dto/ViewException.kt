package com.architecture.clean.entrypoint.controller.dto

import java.time.LocalDateTime

data class ViewException (
        val timestamp: LocalDateTime = LocalDateTime.now(),
        val status: Int,
        val error: String,
        val message: String?,
        val path: String
)
