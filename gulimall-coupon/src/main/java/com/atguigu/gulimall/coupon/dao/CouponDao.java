package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author BT
 * @email 1049264749@qq.com
 * @date 2021-10-17 13:07:26
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
