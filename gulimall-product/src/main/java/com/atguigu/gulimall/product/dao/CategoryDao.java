package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author BT
 * @email 1049264749@qq.com
 * @date 2021-10-17 11:46:26
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
