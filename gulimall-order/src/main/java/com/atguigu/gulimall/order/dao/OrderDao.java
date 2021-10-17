package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author BT
 * @email 1049264749@qq.com
 * @date 2021-10-17 13:11:02
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
