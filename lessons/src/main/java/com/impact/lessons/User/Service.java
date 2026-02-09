package com.impact.lessons.services;

import com.impact.lessons.database.UserStore;
import com.impact.lessons.models.User;

public class UserService {

    private final UserStore store = new UserStore();

    public User createUser(User user) {
        User newUser = new User(
                user.getUsername(),
                user.getEmail(),
                user.getPassword(),
                user.getRole()
        );

        return store.save(newUser);
    }
}
