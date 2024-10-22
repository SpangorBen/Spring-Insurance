package com.spring.insurance.repositories.interfaces;

import com.spring.insurance.models.User;

public interface UserRepository extends GenericRepository<User> {
    User findByEmail(String email);
}
