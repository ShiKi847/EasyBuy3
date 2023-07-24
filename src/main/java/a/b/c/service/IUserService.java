package a.b.c.service;

import a.b.c.entity.User;

public interface IUserService {
    User login(String loginName,String password);
}
