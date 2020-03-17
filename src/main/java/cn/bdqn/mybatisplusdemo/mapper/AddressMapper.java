package cn.bdqn.mybatisplusdemo.mapper;

import cn.bdqn.mybatisplusdemo.entity.Address;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author fuhao
 * @since 2019-12-02
 */
public interface AddressMapper extends BaseMapper<Address> {
    List<Address> selectList();
}
