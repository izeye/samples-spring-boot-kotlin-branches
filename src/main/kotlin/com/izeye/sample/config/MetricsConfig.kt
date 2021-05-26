package com.izeye.sample.config

import io.micrometer.core.instrument.MeterRegistry
import io.micrometer.core.instrument.binder.MeterBinder
import org.springframework.boot.actuate.autoconfigure.metrics.MetricsProperties
import org.springframework.boot.actuate.metrics.data.MetricsRepositoryMethodInvocationListener
import org.springframework.boot.actuate.metrics.data.RepositoryTagsProvider
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Lazy

/**
 * Configuration for metrics.
 *
 * @author Johnny Lim
 */
@Configuration
class MetricsConfig {
    @Bean
    fun myMeterBinder(): MeterBinder {
        return MeterBinder { registry: MeterRegistry -> registry.counter("binder.test") }
    }

    companion object {
        // FIXME: See https://github.com/spring-projects/spring-boot/issues/26630
        @Bean
        fun metricsRepositoryMethodInvocationListener(
            metricsProperties: MetricsProperties,
            @Lazy registry: MeterRegistry,
            tagsProvider: RepositoryTagsProvider
        ): MetricsRepositoryMethodInvocationListener {
            val properties = metricsProperties.data.repository
            return MetricsRepositoryMethodInvocationListener(
                registry, tagsProvider, properties.metricName,
                properties.autotime
            )
        }
    }
}
