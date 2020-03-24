package com.liujie.mappers;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.liujie.beans.Brand;
import com.liujie.beans.Goods;
import com.liujie.beans.Goodskind;

public interface GoodsMapper {
	public List<Goods> findAll(Map<String,Object> map);
	
	public void addGoods(Goods goods);
	
	public void updateGoods(Goods goods);
	
	public void deleteGoods(@Param("ids")String ids);
	
	public List<Brand> findBrand();
	public List<Goodskind> findGoodskind();

	public Goods findOne(Integer gid);
}
