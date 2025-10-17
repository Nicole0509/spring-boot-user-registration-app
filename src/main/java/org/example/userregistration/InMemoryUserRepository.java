package org.example.userregistration;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class InMemoryUserRepository implements UserRepository {

    private Map<String, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        users.put(user.getEmail(), user);
        System.out.println("User was successfully saved!");
    }

    public Map<String, User> getUsers() {
        return users;
    }

    public void setUsers(Map<String, User> users) {
        this.users = users;
    }
}
