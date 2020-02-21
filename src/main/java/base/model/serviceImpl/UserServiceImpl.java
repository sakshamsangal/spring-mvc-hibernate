package base.model.serviceImpl;

import base.model.dao.UserDao;
import base.model.pojo.User;
import base.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public int insert(User user) {
        return userDao.insert(user);
    }

    @Override
    public List<User> loadAll() {
        List<User> users = userDao.loadAll();
        Collections.sort(users);
        return users;
    }
}
