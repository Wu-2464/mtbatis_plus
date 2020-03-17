package cn.bdqn.mybatisplusdemo.service;

import cn.bdqn.mybatisplusdemo.entity.Address;
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
public interface IAddressService extends IService<Address> {
    List<Address> getList();
}
