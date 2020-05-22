package com.izeye.sample.service

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding

/**
 * [ConfigurationProperties] for [PersonService].
 *
 * @author Johnny Lim
 */
@ConfigurationProperties("person-service")
@ConstructorBinding
data class PersonServiceProperties(val uri: String, val connectTimeoutMillis: Int, val readTimeoutMillis: Int)
