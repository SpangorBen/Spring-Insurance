package com.spring.insurance.repositories;

import com.spring.insurance.repositories.interfaces.GenericRepository;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class GenericRepositoryImpl implements GenericRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public Object save(Object o) {
            return null;
    }

    @Override
    public Object findById(Long id) {
        return null;
    }

    @Override
    public Object update(Object o) {
        return null;
    }

    @Override
    public List findAll() {
        return List.of();
    }

    @Override
    public void delete(Object o) {

    }
}
