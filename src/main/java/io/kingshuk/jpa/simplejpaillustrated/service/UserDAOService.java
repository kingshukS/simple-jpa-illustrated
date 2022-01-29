package io.kingshuk.jpa.simplejpaillustrated.service;

import io.kingshuk.jpa.simplejpaillustrated.entity.User;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
public class UserDAOService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void insert(User user)
    {
        user.setId(null);
        entityManager.persist(user);
    }
}
