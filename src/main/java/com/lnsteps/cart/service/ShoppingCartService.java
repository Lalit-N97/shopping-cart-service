package com.lnsteps.cart.service;

import java.util.List;

import com.lnsteps.cart.business.bean.ItemBean;

public interface ShoppingCartService {
	int add(ItemBean item); // incrementing the count of item in the cart table
	int updateQuantity(Long id, int val); // decrementing count of item 
	int delete(Long id); // deleting the entire item (irrespective of its count)
	ItemBean getItem(Long id);
	List<ItemBean> getAllItems(); // list all items
	List<ItemBean> search(String name); // list items in the cart based on their name
}
