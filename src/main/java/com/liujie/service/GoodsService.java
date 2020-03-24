package com.liujie.service;

import java.util.List;
import java.util.Map;

import com.liujie.beans.Brand;
import com.liujie.beans.Goods;
import com.liujie.beans.Goodskind;

public interface GoodsService {
	public List<Goods> findAll(Map<String,Object> map);
	public void addGoods(Goods goods);
	
	public void updateGoods(Goods goods);
	
	public void deleteGoods(String ids);
	
	public List<Brand> findBrand();
	public List<Goodskind> findGoodskind();
	public Goods findOne(Integer gid);
	
}
