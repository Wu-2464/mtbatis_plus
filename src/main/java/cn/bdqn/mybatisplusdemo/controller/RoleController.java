package cn.bdqn.mybatisplusdemo.controller;


import cn.bdqn.mybatisplusdemo.entity.Role;
import cn.bdqn.mybatisplusdemo.service.IRoleService;
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
@RequestMapping("/role")
public class RoleController {

    @Autowired
    private IRoleService iRoleService;


    @RequestMapping("/test")
    public String test(HttpSession session, Model model){
        List<Role> roleList=iRoleService.list();
        model.addAttribute("roleList",roleList);
        session.setAttribute("date",new Date());
        session.setAttribute("msg","session存储数据");
        model.addAttribute("zhi",2);
        model.addAttribute("msg2","thymeleaf模板引擎");
        Role role = new Role();
        role.setRoleCode("qwer");
        role.setRoleName("经理");
        session.setAttribute("role",role);
        return "list";
    }
}
