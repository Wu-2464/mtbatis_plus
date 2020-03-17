package cn.bdqn.mybatisplusdemo.service.impl;

import cn.bdqn.mybatisplusdemo.entity.Role;
import cn.bdqn.mybatisplusdemo.mapper.RoleMapper;
import cn.bdqn.mybatisplusdemo.service.IRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fuhao
 * @since 2019-12-02
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
