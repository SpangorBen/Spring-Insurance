package com.spring.insurance.services.interfaces;

import com.spring.insurance.models.User;

public interface UserService {
    User register(User user);
    User login(String email, String password);
}
