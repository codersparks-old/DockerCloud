package com.github.codersparks.dockercloud.discovery;

import com.github.codersparks.dockercloud.eureka.config.EurekaConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Import;

/**
 * Created by codersparks on 07/11/2015.
 */
@EnableEurekaServer
@SpringBootApplication
@Import(EurekaConfiguration.class)
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
