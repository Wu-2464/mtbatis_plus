package cn.bdqn.mybatisplusdemo.service;

import cn.bdqn.mybatisplusdemo.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fuhao
 * @since 2019-12-02
 */
public interface IUserService extends IService<User> {
List<User> findList();
List<User> findUserList();
}
