package com.izeye.sample.config

import io.micrometer.core.instrument.MeterRegistry
import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

/**
 * Tests for [MetricsConfig].
 *
 * @author Johnny Lim
 */
@SpringBootTest
class MetricsConfigTests(val registry: MeterRegistry) {
    @Test
    fun userDefinedMeterBinderWorks() {
        Assertions.assertThat(registry.find("binder.test").counter()).isNotNull
    }
}
