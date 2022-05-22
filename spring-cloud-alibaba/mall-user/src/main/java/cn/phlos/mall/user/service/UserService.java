package cn.phlos.mall.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import cn.phlos.common.utils.PageUtils;
import cn.phlos.mall.user.entity.UserEntity;

import java.util.Map;

/**
 * 
 *
 * @author fox
 * @email 2763800211@qq.com
 * @date 2021-01-28 15:53:24
 */
public interface UserService extends IService<UserEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

