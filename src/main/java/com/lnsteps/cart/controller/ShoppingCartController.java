package com.lnsteps.cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lnsteps.cart.business.bean.ItemBean;
import com.lnsteps.cart.service.ShoppingCartService;

@RestController
@RequestMapping("/")
public class ShoppingCartController {
	
	@Autowired
	ShoppingCartService cartService;
	
	@GetMapping(value = "", produces = "application/json")
	public List<ItemBean> getAllItems(){
		return cartService.getAllItems();
	}
	
	@RequestMapping(value = "add", method = RequestMethod.POST, produces = "application/json")
//	@ResponseBody
	public int add(@RequestBody ItemBean item) {
		return 1;
	}
	
}
