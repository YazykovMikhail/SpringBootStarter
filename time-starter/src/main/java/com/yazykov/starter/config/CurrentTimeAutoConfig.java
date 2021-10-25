package com.yazykov.starter.config;

import com.yazykov.starter.services.TimeService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.yazykov")
//@ConditionalOnClass({TimeService.class})
public class CurrentTimeAutoConfig {
}
