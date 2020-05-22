package com.izeye.sample.service

import com.izeye.sample.domain.Person

/**
 * Service for [Person].
 *
 * @author Johnny Lim
 */
interface PersonService {
    fun get(id: Long): Person
}
