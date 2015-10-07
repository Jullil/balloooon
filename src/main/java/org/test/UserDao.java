package org.test;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.jground.util.Hibernate;
import org.test.entity.User;

public class UserDao {
    protected static final Logger logger = Logger.getRootLogger();

    @Override
    public boolean addUser(String userName, String login, String password) {
        boolean result = false;
        Session session = null;
        try {
            session = Hibernate.getSessionFactory().openSession();
            session.beginTransaction();
            User user = new User(userName, login, password);
            session.save(user);
            session.getTransaction().commit();
            result = true;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return result;
    }

    @Override
    public User getUser(String login) {
        Session session = null;
        User user = null;
        try {
            session = Hibernate.getSessionFactory().openSession();
            user = (User) session.createCriteria(User.class).add(Restrictions.eq("login", login)).uniqueResult();
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
        return user;
    }
}
