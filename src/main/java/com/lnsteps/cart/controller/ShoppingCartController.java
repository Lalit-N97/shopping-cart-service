package com.lnsteps.cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lnsteps.cart.business.bean.ItemBean;
import com.lnsteps.cart.service.ShoppingCartService;
import com.sun.tools.sjavac.Log;

@RestController
@RequestMapping("/api/cart")
public class ShoppingCartController {
	
	@Autowired
	ShoppingCartService cartService;
	
	@GetMapping(value = "/items")
	public List<ItemBean> getAllItems(){
		return cartService.getAllItems();
	}
	
	@GetMapping(value = "items/{id}")
	public ItemBean getItem(@PathVariable("id") Long id){
		return cartService.getItem(id);
	}
	
//	@RequestMapping(value = "add", method = RequestMethod.POST, consumes = "application/json")
//	@RequestMapping(value = "/add", method = RequestMethod.POST)
	@PostMapping("/add")
	public int add(@RequestBody ItemBean item) {
		Log.info(item.toString());
		return cartService.add(item);
	}
	
	public int delete(Long id) {
		return cartService.delete(id);
	}
	
	public void decrementQuantity(Long id) {
		return cartService.updateQuantity(id, inc);
	}
	
	public void incrementQuantity(Long id) {
		
	}
	
}
