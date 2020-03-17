package cn.bdqn.mybatisplusdemo.service.impl;

import cn.bdqn.mybatisplusdemo.entity.User;
import cn.bdqn.mybatisplusdemo.mapper.UserMapper;
import cn.bdqn.mybatisplusdemo.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fuhao
 * @since 2019-12-02
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findList() {
        return userMapper.selectList(null);
    }

    @Override
    public List<User> findUserList() {
        return userMapper.selectList(null);
    }
}

