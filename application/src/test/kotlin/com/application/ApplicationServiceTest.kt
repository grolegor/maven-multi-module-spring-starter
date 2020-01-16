package com.application

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class ApplicationServiceTest {

    @Autowired
    lateinit var applicationService: ApplicationService

    @Test
    fun test() {
        println(applicationService.call())
    }

}
