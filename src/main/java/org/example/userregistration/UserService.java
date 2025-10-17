package org.example.userregistration;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class UserService {


    private final UserRepository user;
    private final NotificationService notification;

    public UserService(UserRepository user, NotificationService notification) {
        this.user = user;
        this.notification = notification;
    }

    public void register (User user){
        this.user.save(user);
        this.notification.send("Hello World!", user.getEmail());
    }

}
