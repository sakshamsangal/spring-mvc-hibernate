package base.model.daoimpl;

import base.model.dao.UserDao;
import base.model.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public int insert(User user) {
        int result = (int) hibernateTemplate.save(user);
        return result;
    }

    @Override
    public List<User> loadAll() {
        return hibernateTemplate.loadAll(User.class);

    }
}
