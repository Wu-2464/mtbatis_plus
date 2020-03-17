package cn.bdqn.mybatisplusdemo.service.impl;

import cn.bdqn.mybatisplusdemo.entity.Address;
import cn.bdqn.mybatisplusdemo.mapper.AddressMapper;
import cn.bdqn.mybatisplusdemo.service.IAddressService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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
public class AddressServiceImpl extends ServiceImpl<AddressMapper, Address> implements IAddressService {
    @Autowired
    private  AddressMapper addressMapper;

    @Override
    public List<Address> getList() {
        return addressMapper.selectList(null);
    }





}
