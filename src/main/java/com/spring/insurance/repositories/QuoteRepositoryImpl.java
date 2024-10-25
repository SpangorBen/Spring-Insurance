package com.spring.insurance.repositories;

import com.spring.insurance.models.Quote;
import com.spring.insurance.models.User;
import com.spring.insurance.repositories.interfaces.QuoteRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class QuoteRepositoryImpl extends GenericRepositoryImpl<Quote> implements QuoteRepository {

    public QuoteRepositoryImpl() {
        super(Quote.class);
    }

    @Override
    public List<Quote> findQuotesByUser(User user) {
        try (Session session = sessionFactory.openSession()) {
            String hql = "SELECT q FROM Quote q JOIN q.insurance i JOIN i.user u WHERE u = :user";
            Query<Quote> query = session.createQuery(hql, Quote.class);
            query.setParameter("user", user);
            return query.getResultList();
        } catch (Exception e) {
            logger.severe("Error finding quotes by user: " + e.getMessage());
            throw new RuntimeException("Error finding quotes by user", e);
        }
    }
}
