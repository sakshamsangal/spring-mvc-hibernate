package base.model.service;

import base.model.pojo.User;

import java.util.List;

public interface UserService {
    int insert(User user);
    List<User> loadAll();
}
