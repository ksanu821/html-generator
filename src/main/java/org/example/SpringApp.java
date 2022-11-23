package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.aws.autoconfigure.context.ContextRegionProviderAutoConfiguration;
import org.springframework.cloud.aws.autoconfigure.context.ContextStackAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(
        exclude = {ContextRegionProviderAutoConfiguration.class, ContextStackAutoConfiguration.class})
@EnableScheduling
public class SpringApp {
    public static void main(final String[] args) {
        SpringApplication.run(SpringApp.class, args);
    }
}
