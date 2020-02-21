package base.model.dao;

import base.model.pojo.User;

import java.util.List;

public interface UserDao {
    int insert(User user);
    List<User> loadAll();
}
