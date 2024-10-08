package org.godpro.godpro_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class GodProServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(GodProServerApplication.class, args);
    }

}
