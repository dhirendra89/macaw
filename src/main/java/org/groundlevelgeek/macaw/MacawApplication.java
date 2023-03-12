package org.groundlevelgeek.macaw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableMongoRepositories
@EnableWebMvc
public class MacawApplication {

    public static void main(String[] args) {
        SpringApplication.run(MacawApplication.class, args);
    }

}
