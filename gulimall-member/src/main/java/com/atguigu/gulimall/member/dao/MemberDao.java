package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author BT
 * @email 1049264749@qq.com
 * @date 2021-10-17 13:12:40
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
