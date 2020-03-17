package cn.bdqn.mybatisplusdemo.service.impl;

import cn.bdqn.mybatisplusdemo.entity.Bill;
import cn.bdqn.mybatisplusdemo.mapper.BillMapper;
import cn.bdqn.mybatisplusdemo.service.IBillService;
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
public class BillServiceImpl extends ServiceImpl<BillMapper, Bill> implements IBillService {

}
