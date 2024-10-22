package com.spring.insurance.repositories;

import com.spring.insurance.models.User;
import com.spring.insurance.repositories.interfaces.UserRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepositoryImpl extends GenericRepositoryImpl<User> implements UserRepository {

    public UserRepositoryImpl() {
        super(User.class);
    }

    @Override
    public User findByEmail(String email) {
        try (Session session = sessionFactory.openSession()) {
            Query<User> query = session.createQuery("FROM User WHERE email = :email", User.class);
            query.setParameter("email", email);
            return query.uniqueResult();
        } catch (Exception ex) {
            logger.severe("Error finding user by email: " + ex.getMessage());
            throw new RuntimeException("Error finding user by email", ex);
        }
    }

}
