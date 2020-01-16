package com.application

import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.stereotype.Service

@Service
@EnableConfigurationProperties(Properties::class)
class LibraryService(private val properties: Properties) {
    fun name() = properties.name
}
