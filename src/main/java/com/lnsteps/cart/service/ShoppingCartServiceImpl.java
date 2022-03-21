package com.lnsteps.cart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnsteps.cart.business.bean.ItemBean;
import com.lnsteps.cart.dao.ItemDaoWrapper;

@Service
public class ShoppingCartServiceImpl implements ShoppingCartService{
	
	@Autowired
	ItemDaoWrapper dao;
	
	@Override
	public int add(ItemBean item) {
		// TODO Auto-generated method stub
		return dao.add(item);
	}

	@Override
	public int updateQuantity(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ItemBean getItem(Long id) {
		// TODO Auto-generated method stub
		return dao.getItem(id);
	}

	@Override
	public List<ItemBean> getAllItems() {
		return dao.getAllItems();
	}

	@Override
	public List<ItemBean> search(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
