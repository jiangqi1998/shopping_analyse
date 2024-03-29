package com.bigdata.shopping_analyse.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bigdata.shopping_analyse.pojo.ShoppingInfo;

@Mapper
public interface ShoppingInfoMapper {
	@Select("select * from shopping_info")
	List<ShoppingInfo> findall();
	@Select("select count(*) from shopping_info")
	int count();
}
