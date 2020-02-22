package base.controller;

import base.model.pojo.User;
import base.model.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping("/loadAll")
    public String loadAll(ModelMap modelMap) {
        List<User> users = userService.loadAll();
        modelMap.addAttribute("users", users);
        return "page3";
    }

    @RequestMapping(value = "/req2", method = RequestMethod.POST)
    public String req2(@ModelAttribute("user") User user, ModelMap modelMap) {
        int id = userService.insert(user);
        modelMap.addAttribute("id", id);
        return "page1";
    }

    @RequestMapping("/req4")
    public @ResponseBody String req4(@RequestParam("id") int id) {
        User user = userService.findUser(id);
        String msg = "";
        if(user != null) msg = "already exist";
        return msg;
    }
}
