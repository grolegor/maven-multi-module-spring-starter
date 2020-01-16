package com.application

import org.springframework.boot.context.properties.ConfigurationProperties

@ConfigurationProperties("properties")
class Properties {
    lateinit var name: String
}
