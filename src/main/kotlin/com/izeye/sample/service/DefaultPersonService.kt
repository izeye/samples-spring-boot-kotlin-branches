package com.izeye.sample.service

import com.izeye.sample.domain.Gender
import com.izeye.sample.domain.Person
import org.slf4j.LoggerFactory
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.stereotype.Service

/**
 * Default [PersonService].
 *
 * @author Johnny Lim
 */
@Service
@EnableConfigurationProperties(PersonServiceProperties::class)
class DefaultPersonService(val personServiceProperties: PersonServiceProperties) : PersonService {
    val log = LoggerFactory.getLogger(DefaultPersonService::class.java)

    override fun get(id: Long): Person {
        log.info("personServiceProperties: {}", personServiceProperties)
        return Person(
            id,
            "Johnny",
            "Lim",
            Gender.MALE
        )
    }
}
