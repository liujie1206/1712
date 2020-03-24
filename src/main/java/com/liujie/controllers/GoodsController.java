package com.liujie.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aspectj.util.FileUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.liujie.beans.Brand;
import com.liujie.beans.Goods;
import com.liujie.beans.Goodskind;
import com.liujie.service.GoodsService;
import com.liujie.utils.FileUtils;

@Controller
public class GoodsController {
		@Resource
		public GoodsService goodsService;
		@RequestMapping("/findAll")
		public String findAll(Model model,@RequestParam(defaultValue="1")Integer pageNum){
			Map<String, Object> map =new HashMap<String, Object>();
			PageHelper.startPage(pageNum, 2);
			List<Goods> list = goodsService.findAll(map);
			PageInfo<Goods> pageInfo = new PageInfo<Goods>(list);
			model.addAttribute("pageInfo",pageInfo);
			return "list";
		}
	@RequestMapping("/addGoods")	
	public String addGoods(Goods goods,MultipartFile file){
			try {
				String pic = FileUtils.upload(file);
				goods.setPicture(pic);
				goodsService.addGoods(goods);
				return "redirect:findAll";
			} catch (Exception e) {
				return "add";
			}
			
	}
	
	@RequestMapping("lookImg")
	public void lookImg(String path,HttpServletRequest request,HttpServletResponse response){
		FileUtils.lookImg(path, request, response);
	}
	
	@RequestMapping("/updateGoods")	
	public String updateGoods(Goods goods,MultipartFile file){
			try {
				String pic = FileUtils.upload(file);
				goods.setPicture(pic);
				goodsService.updateGoods(goods);
				return "redirect:findAll";
			} catch (Exception e) {
				return "update";
			}
			
	}
	@RequestMapping("/deleteGoods")	
	@ResponseBody
	public boolean deleteGoods(String ids){
			try {
				System.out.println("15454");
				System.out.println(ids);
				goodsService.deleteGoods(ids);
				return true;
			} catch (Exception e) {
				return false;
			}
			
	}
	
	@RequestMapping("/findbk")
	public String findbk(Model model){
		
		List<Brand> brand = goodsService.findBrand();
		List<Goodskind> goodskind = goodsService.findGoodskind();
		model.addAttribute("brand",brand);
		model.addAttribute("goodskind",goodskind);
		return "add";
	}
	
	@RequestMapping("/findOne")
	public String findOne(Model model,Integer gid){
		List<Brand> brand = goodsService.findBrand();
		List<Goodskind> goodskind = goodsService.findGoodskind();
		model.addAttribute("brand",brand);
		model.addAttribute("goodskind",goodskind);
		Goods goods = goodsService.findOne(gid);
		
		model.addAttribute("goods",goods);
		
		return "update";
	}
	
	
}
