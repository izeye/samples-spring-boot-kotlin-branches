package com.izeye.sample.domain

import com.fasterxml.jackson.annotation.JsonValue

/**
 * Gender.
 *
 * @author Johnny Lim
 */
enum class Gender(@JsonValue val code: String) {

    MALE("M"), FEMALE("F")
}
