package base.controller;

import base.model.pojo.User;
import base.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/req1")
    public String req1() {
        return "page1";
    }

    @RequestMapping(value = "/req2", method = RequestMethod.POST)
    public String req2(@ModelAttribute("user") User user, ModelMap modelMap) {
        int id = userService.insert(user);
        modelMap.addAttribute("id", id);
        return "page1";
    }
}
