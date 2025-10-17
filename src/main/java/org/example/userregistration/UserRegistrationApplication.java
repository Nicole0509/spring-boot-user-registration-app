package org.example.userregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class UserRegistrationApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(UserRegistrationApplication.class, args);
        var userService = context.getBean(UserService.class);
        var user = context.getBean(User.class);

        user.setId(1);
        user.setName("Nicole");
        user.setEmail("nicole@gmail.com");
        user.setPassword("nicole123456");

        userService.register(user);

        context.close();
    }

}
