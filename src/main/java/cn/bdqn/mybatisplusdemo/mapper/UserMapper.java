package cn.bdqn.mybatisplusdemo.mapper;

import cn.bdqn.mybatisplusdemo.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author fuhao
 * @since 2019-12-02
 */
@Component
public interface UserMapper extends BaseMapper<User> {
List<User> selectUserList();
}
