package com.izeye.sample.web

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.reactive.server.WebTestClient

/**
 * Tests for [PersonController].
 *
 * @author Johnny Lim
 */
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PersonControllerTests(@Autowired val webClient: WebTestClient) {
    @Test
    fun `Get a person`() {
        webClient.get().uri("/persons/1").exchange()
            .expectStatus().isOk
            .expectBody().jsonPath("$.firstName").value { firstName: String ->
                assertThat(firstName).isEqualTo("Johnny")
            }
    }
}
