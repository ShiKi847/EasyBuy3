package a.b.c.test;

import a.b.c.entity.User;
import a.b.c.service.IUserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo01 {
    @Test
    public void f01() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        IUserService userService = ac.getBean(IUserService.class);
        //User user = userService.queryOne(1);
        //System.out.println(user);
    }

    @Test
    public void f02() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("application.xml");
        IUserService userService = ac.getBean(IUserService.class);
        //User user = userService.queryOne(2);
        //System.out.println(user);
    }
}
