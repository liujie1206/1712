package com.liujie.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.liujie.beans.Brand;
import com.liujie.beans.Goods;
import com.liujie.beans.Goodskind;
import com.liujie.mappers.GoodsMapper;
@Service
public class GoodsServiceImpl implements GoodsService{
	@Resource
	public GoodsMapper goodsMapper;
	public List<Goods> findAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return goodsMapper.findAll(map);
	}
	public void addGoods(Goods goods) {
		goodsMapper.addGoods(goods);
		
	}
	public void updateGoods(Goods goods) {
		goodsMapper.updateGoods(goods);
		
	}
	public void deleteGoods(String ids) {
		goodsMapper.deleteGoods(ids);
		
	}
	public List<Brand> findBrand() {
		List<Brand> list = goodsMapper.findBrand();
		return list;
	}
	public List<Goodskind> findGoodskind() {
		List<Goodskind> list = goodsMapper.findGoodskind();
		return list;
	}
	public Goods findOne(Integer gid) {
		Goods goods = goodsMapper.findOne(gid);
		return goods;
	}
	

}
