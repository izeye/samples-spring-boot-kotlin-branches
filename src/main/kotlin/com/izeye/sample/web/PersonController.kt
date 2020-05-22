package com.izeye.sample.web

import com.izeye.sample.domain.Person
import com.izeye.sample.service.PersonService
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
class PersonController(val personService: PersonService) {
    @GetMapping("/{id}")
    fun get(@PathVariable id: Long): Person = personService.get(id)
}
