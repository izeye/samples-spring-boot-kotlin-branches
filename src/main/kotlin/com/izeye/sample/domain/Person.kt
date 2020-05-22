package com.izeye.sample.domain

/**
 * Person.
 *
 * @author Johnny Lim
 */
data class Person(
    val id: Long,
    val firstName: String,
    val lastName: String,
    val gender: Gender
)
