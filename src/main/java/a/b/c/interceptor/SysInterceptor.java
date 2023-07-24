package a.b.c.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SysInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("系统拦截器执行了");
        Object user = request.getSession().getAttribute("user");
        if (user != null) return true;
        response.setStatus(401);
        request.getRequestDispatcher("/401.jsp").forward(request, response);
        return false;
    }
}
