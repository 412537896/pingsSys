package cn.pings.service.api.sys.service;

import cn.pings.service.api.common.service.BaseService;
import cn.pings.service.api.sys.entity.Right;

import java.util.List;

/**
 *********************************************************
 ** @desc  ： 权限管理
 ** @author  Pings
 ** @date    2019/3/8
 ** @version v1.0
 * *******************************************************
 */
public interface RightService extends BaseService<Right> {

    /**
     *********************************************************
     ** @desc ： 查询所有权限的树形结构
     ** @author Pings
     ** @date   2019/3/8
     ** @return List
     * *******************************************************
     */
    List<Right> findTreeAll();

    /**
     *********************************************************
     ** @desc ： 根据编码获取权限
     ** @author Pings
     ** @date   2019/3/8
     ** @param  code  编码
     ** @return Right
     * *******************************************************
     */
    Right getByCode(String code);

}
