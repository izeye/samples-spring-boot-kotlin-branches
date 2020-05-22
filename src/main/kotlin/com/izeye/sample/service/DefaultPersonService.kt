package com.izeye.sample.service

import com.izeye.sample.domain.Gender
import com.izeye.sample.domain.Person
import org.springframework.stereotype.Service

/**
 * Default [PersonService].
 *
 * @author Johnny Lim
 */
@Service
class DefaultPersonService : PersonService {
    override fun get(id: Long): Person =
        Person(
            id,
            "Johnny",
            "Lim",
            Gender.MALE
        )
}
