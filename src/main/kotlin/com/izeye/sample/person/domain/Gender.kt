package com.izeye.sample.person.domain

import com.fasterxml.jackson.annotation.JsonValue

/**
 * Gender.
 *
 * @author Johnny Lim
 */
enum class Gender(@JsonValue val code: String) {

    MALE("M"), FEMALE("F")
}
