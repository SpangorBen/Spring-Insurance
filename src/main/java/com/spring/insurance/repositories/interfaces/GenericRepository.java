package com.spring.insurance.repositories.interfaces;

import java.util.List;
import java.util.Optional;

public interface GenericRepository<T> {
    T save(T t);
    Optional<T> findById(Long id);
    T update(T t);
    List<T> findAll();
    void delete(Long id);
}
