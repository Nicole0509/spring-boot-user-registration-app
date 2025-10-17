package org.example.userregistration;

import org.springframework.stereotype.Service;

@Service
public class UserService {


    private final UserRepository user;
    private final NotificationService notification;

    public UserService(UserRepository user, NotificationService notification) {
        this.user = user;
        this.notification = notification;
    }

    public void register (User user){

        if(this.user.findByEmail(user.getEmail()) != null){
            throw new IllegalArgumentException("User with email: " + user.getEmail() + " already exists");
        }

        this.user.save(user);
        this.notification.send(user.getName() + " was successfully registered", user.getEmail());
    }

}
