package a.b.c.web;

import a.b.c.entity.User;
import a.b.c.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @PostMapping ("/Login.do")
    public String login(String loginName, String password, HttpSession session, Model model) throws IOException {
        User user = userService.login(loginName, password);
        if(user != null){
            session.setAttribute("user",user);
            return "redirect:/Index.jsp" ;
        }
        model.addAttribute("tip","账号或密码错误");
        return "/Login.jsp";
    }
    @RequestMapping("/Logout.do")
    public String logout(HttpSession session){
        session.removeAttribute("user");
        return "redirect:/Index.jsp" ;
    }
}
