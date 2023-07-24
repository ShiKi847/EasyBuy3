package a.b.c.service.impl;

import a.b.c.dao.UserMapper;
import a.b.c.entity.User;
import a.b.c.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    public User login(String loginName, String password) {
        return userMapper.selectOne(loginName,password);

    }
}
