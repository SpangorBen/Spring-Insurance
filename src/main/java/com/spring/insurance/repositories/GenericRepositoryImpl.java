package com.spring.insurance.repositories;

import com.spring.insurance.repositories.interfaces.GenericRepository;
import jakarta.transaction.Transactional;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

public class GenericRepositoryImpl<T> implements GenericRepository<T> {

    protected final Logger logger = Logger.getLogger(GenericRepositoryImpl.class.getName());

    @Autowired
    protected SessionFactory sessionFactory;

    protected Class<T> persistentClass;

    public GenericRepositoryImpl(Class<T> persistentClass) {
        this.persistentClass = persistentClass;
    }


    @Override
    @Transactional
    public T save(T t) {
        try (Session session = sessionFactory.openSession()) {
            Transaction transaction = session.beginTransaction();
            session.persist(t);
            transaction.commit();
            return t;
        } catch (HibernateException e) {
            logger.severe("Error saving entity: " + e.getMessage());
            throw new RuntimeException("Error saving entity", e);
        }
    }

    @Override
    public Optional<T> findById(Long id) {
        try (Session session = sessionFactory.openSession()) {
            return Optional.ofNullable(session.get(persistentClass, id));
        } catch (HibernateException e) {
            logger.severe("Error finding entity: " + e.getMessage());
            throw new RuntimeException("Error finding entity", e);
        }
    }

    @Override
    @Transactional
    public T update(T t) {
        try (Session session = sessionFactory.openSession()) {
            session.merge(t);
            return t;
        } catch (HibernateException e) {
            logger.severe("Error updating entity: " + e.getMessage());
            throw new RuntimeException("Error updating entity", e);
        }
    }

    @Override
    public List<T> findAll() {
        try (Session session = sessionFactory.openSession()) {
            return session.createQuery("SELECT e FROM " + persistentClass.getSimpleName() + " e", persistentClass)
                    .getResultList();
        } catch (HibernateException e) {
            logger.severe("Error finding all entities: " + e.getMessage());
            throw new RuntimeException("Error finding all entities", e);
        }
    }

    @Override
    @Transactional
    public void delete(Long id) {
        try (Session session = sessionFactory.openSession()) {
            T  entity = session.get(persistentClass, id);
            if (entity != null) {
                session.remove(entity);
            }
        } catch (HibernateException e) {
            logger.severe("Error deleting entity: " + e.getMessage());
            throw new RuntimeException("Error deleting entity", e);
        }
    }
}
