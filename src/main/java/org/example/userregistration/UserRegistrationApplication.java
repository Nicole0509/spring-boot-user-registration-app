package org.example.userregistration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class UserRegistrationApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(UserRegistrationApplication.class, args);
        var userService = context.getBean(UserService.class);

        userService.register(new User(1,"Nicole","nicole@gmail.com","nicole123456"));
        userService.register(new User(2,"Nicole","nicoley@gmail.com","nicole123456"));
        userService.register(new User(3,"Nicole","nicole@gmail.com","nicole123456"));

        context.close();
    }

}
