package com.architecture.clean.usecases.mapper

interface Mapper<T, U> {

        fun map(t: T): U
}
