package com.spring.insurance.repositories.interfaces;

import java.util.List;

public interface GenericRepository<T> {
    T save(T t);
    T findById(Long id);
    T update(T t);
    List<T> findAll();
    void delete(Long id);
}
