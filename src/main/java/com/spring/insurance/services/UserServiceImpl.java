package com.spring.insurance.services;

import com.spring.insurance.models.User;
import com.spring.insurance.repositories.interfaces.UserRepository;
import com.spring.insurance.services.interfaces.UserService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public User register(User user) {
        //validation

        if (user.getEmail() == null || user.getEmail().isEmpty()
            || user.getPassword() == null || user.getPassword().isEmpty()
            || user.getName() == null || user.getName().isEmpty()
            || user.getBirthDate() == null) {
            throw new RuntimeException("All fields are required");
        }

        if (userRepository.findByEmail(user.getEmail()) != null) {
            throw new RuntimeException("User with email " + user.getEmail() + " already exists");
        }

        String password = passwordEncoder.encode(user.getPassword());
        user.setPassword(password);

        return userRepository.save(user);
    }

    @Override
    public User login(String email, String password) {
        User user = userRepository.findByEmail(email);

        if (user == null) {
            throw new RuntimeException("User with email " + email + " not found");
        }

        if (!passwordEncoder.matches(password, user.getPassword())) {
            throw new RuntimeException("Invalid password");
        }

        return user;
    }
}
