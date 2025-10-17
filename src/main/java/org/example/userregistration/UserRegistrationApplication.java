package org.example.userregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class UserRegistrationApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(UserRegistrationApplication.class, args);

        context.close();
    }

}
