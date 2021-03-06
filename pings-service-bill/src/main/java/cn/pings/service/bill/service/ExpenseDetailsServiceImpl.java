package cn.pings.service.bill.service;

import cn.pings.service.api.bill.entity.ExpenseDetails;
import cn.pings.service.api.bill.service.ExpenseDetailsService;
import cn.pings.service.bill.mapper.ExpenseDetailsMapper;
import cn.pings.sys.commons.service.AbstractBaseService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 *********************************************************
 ** @desc  ： 消费明细管理
 ** @author  Pings
 ** @date    2019/3/28
 ** @version v1.0
 * *******************************************************
 */
@Service(version = "${bill.service.version}")
@Component
public class ExpenseDetailsServiceImpl extends AbstractBaseService<ExpenseDetailsMapper, ExpenseDetails> implements ExpenseDetailsService {

    @Override
    public IPage<ExpenseDetails> findPage(IPage<ExpenseDetails> page, ExpenseDetails entity){
        return this.baseMapper.selectPage(page, new QueryWrapper<>(entity).orderByDesc("expense_date"));
    }
}
