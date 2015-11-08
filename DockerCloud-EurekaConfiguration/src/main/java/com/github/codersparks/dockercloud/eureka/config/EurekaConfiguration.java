package com.github.codersparks.dockercloud.eureka.config;

import org.springframework.cloud.netflix.eureka.EurekaInstanceConfigBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

/**
 * Created by codersparks on 08/11/2015.
 */
@Configuration
public class EurekaConfiguration {

    @Bean
    public EurekaInstanceConfigBean eurekaInstanceConfig() {
        EurekaInstanceConfigBean config = new EurekaInstanceConfigBean();
        config.setHostname(System.getenv("EUREKA_HOSTNAME"));
        config.setIpAddress(System.getenv("EUREKA_IP_ADDRESS"));
        config.setNonSecurePort(Integer.parseInt(System.getenv("EUREKA_PORT")));
        return config;
    }

}
