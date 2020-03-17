package cn.bdqn.mybatisplusdemo.controller;


import cn.bdqn.mybatisplusdemo.entity.Address;
import cn.bdqn.mybatisplusdemo.entity.User;
import cn.bdqn.mybatisplusdemo.service.IAddressService;
import com.alibaba.fastjson.JSONArray;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.Update;
import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

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
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private IAddressService iAddressService;
    @RequestMapping("/list")
    public String list(int current){
        QueryWrapper<Address> q = new QueryWrapper<>();
        List<Address> addressList=iAddressService.getList();

        IPage<Address> iPage = new Page<>();
        iPage.setCurrent(current);
        iPage.setSize(5);
        IPage<Address> addresspage =  iAddressService.page(iPage);
        return JSONArray.toJSONString(addresspage.getRecords());
    }

    @RequestMapping("/add")
    public String add(Address address) {
        boolean b = iAddressService.save(address);
        return "b" + b;
    }

    @RequestMapping("/update")
    public String update(Address address){
        boolean b = iAddressService.updateById(address);
       return "b:"+b;
    }

    @RequestMapping("/delete")
    public String delete(Integer id){
        return iAddressService.removeById(id)+"";
    }
}
