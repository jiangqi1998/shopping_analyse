package com.bigdata.shopping_analyse.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import com.bigdata.shopping_analyse.mapper.ShoppingInfoMapper;
import com.bigdata.shopping_analyse.pojo.ShoppingInfo;

@Controller
public class ShoppingInfoController { 
	@Autowired ShoppingInfoMapper shoppinginfomapper;
	@RequestMapping("/shoppinginfo") 
	public String listCategory(Model m) throws Exception {
		List<ShoppingInfo> shop=shoppinginfomapper.findall();
		for(ShoppingInfo s : shop) {
			System.out.println(s.getGoods_id()+s.getGoods_name());
		}
		
		System.out.println(shoppinginfomapper.count()); 
		m.addAttribute("shop", shop);
		return "shopping_info";
	}
}
