package cn.bdqn.mybatisplusdemo.controller;


import cn.bdqn.mybatisplusdemo.entity.User;
import cn.bdqn.mybatisplusdemo.service.IUserService;
import com.alibaba.fastjson.JSONArray;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fuhao
 * @since 2019-12-02
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;

    @RequestMapping("/list")
    public String list(HttpSession session, Model model) {
       /* QueryWrapper<User> q = new QueryWrapper<>();
        q.eq("userCode","admin");
        q.eq("userPassword","1234567");
        q.like("userName","ad");
        q.in("userCode","1,2,3");*/
        // List<User> userList=userService.list(q);
        //List<User> userList=userService.findList();

      /*  IPage<User> iPage = new Page<>();
        iPage.setCurrent(current);
        iPage.setSize(5);
        IPage<User> userPage = userService.page(iPage );*/

        //List<User> user List=userService.findList();

        // User user=userService.getOne(q);
        //return JSONObject.toJSONString(user);
        //  return JSONObject.toJSONString(userPage.getRecords());

       List<User> userList = userService.list();
        session.setAttribute("date", new Date());
        model.addAttribute("count", 1);
        model.addAttribute("userList", userList);
        model.addAttribute("msg", "thymeleaf模板引擎");
        session.setAttribute("msg2", "session存储数据");
        User user = new User();
        user.setUserName("刘giao豪");
        user.setUserPassword("123456");
        session.setAttribute("user", user);
        return "userList";
    }

    @RequestMapping("/list1")
    public String list1() {
        QueryWrapper<User> q = new QueryWrapper<>();
        List<User> ulist = userService.findUserList();
        return JSONArray.toJSONString(ulist);
    }

    @RequestMapping("/add")
    public String add(User user) {
        boolean b = userService.save(user);
        return "b" + b;
    }

    @RequestMapping("/update")
    public String update(User user) {
      /*  UpdateWrapper<User> uw = new UpdateWrapper<>();
        uw.set("id",18);
        uw.set("userName","fa");*/
        boolean b = userService.updateById(user);
        return "b:" + b;
    }

    @RequestMapping("/delete")
    public String delete(Integer id) {
        return userService.removeById(id) + "";
    }



   }



