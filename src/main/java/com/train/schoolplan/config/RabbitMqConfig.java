package com.train.schoolplan.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Sweary
 * @packagename:com.project.config
 * @classname:RabbitMqConfig
 * @date 2021/8/2 - 17:42
 */
@Configuration
public class RabbitMqConfig {
    @Bean
    Jackson2JsonMessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }
    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange("directExchange", true, false);
    }
    @Bean
    public Queue msgQueue(){
        return new Queue("msgQueue",true);
    }
    @Bean
    public Binding msgBinding(){
        return BindingBuilder.bind(msgQueue()).to(directExchange()).with("msg");
    }

}

