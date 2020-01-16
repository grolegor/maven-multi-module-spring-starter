package com.application

import org.springframework.stereotype.Service

@Service
class ApplicationService(private val libraryService: LibraryService) {
    fun call() = libraryService.name()
}