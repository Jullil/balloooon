package org.test;

import org.test.entity.User;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.logging.Logger;

@LocalBean
@Stateless
public class UserDao {
    protected static final Logger logger = Logger.getLogger(UserDao.class.getName());

    @PersistenceContext(unitName = "ballooon-db")
    protected EntityManager entityManager;


    public boolean addUser(String userName, String login, String password) {
        User user = new User(userName, login, password);
        entityManager.persist(user);
        return true;
    }

    public User getUser(String login) {
//        entityManager.find(User.class, )
//        Session session = null;
//        User user = null;
//        try {
//            session = Hibernate.getSessionFactory().openSession();
//            user = (User) session.createCriteria(User.class).add(Restrictions.eq("login", login)).uniqueResult();
//        } catch (Exception e) {
//            logger.error(e.getMessage(), e);
//        } finally {
//            if (session != null && session.isOpen()) {
//                session.close();
//            }
//        }
        return null;
    }
}
