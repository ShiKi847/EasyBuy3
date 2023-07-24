package a.b.c.dao;

import a.b.c.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User selectOne(@Param("loginName") String loginName,@Param("password") String password);
}
