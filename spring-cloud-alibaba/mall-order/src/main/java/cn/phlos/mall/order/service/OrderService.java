package cn.phlos.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.phlos.common.utils.PageUtils;
import cn.phlos.mall.order.entity.OrderEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 *
 * @author fox
 * @email 2763800211@qq.com
 * @date 2021-01-28 15:46:19
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<OrderEntity>  listByUserId(Integer userId);
}

