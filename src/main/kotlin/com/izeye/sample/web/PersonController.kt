package com.izeye.sample.web

import com.izeye.sample.person.domain.Person
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * [RestController] for [Person].
 *
 * @author Johnny Lim
 */
@RestController
@RequestMapping("/persons")
class PersonController {

    @GetMapping("/{id}")
    fun get(@PathVariable id: Long): Person = Person(id, "Johnny", "Lim")

}
