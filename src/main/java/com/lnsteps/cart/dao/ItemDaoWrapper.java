package com.lnsteps.cart.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lnsteps.cart.business.bean.ItemBean;
import com.lnsteps.cart.entity.ItemEntity;

@Repository
public class ItemDaoWrapper {
	
	@Autowired
	ItemRepository repo;
	
	public List<ItemBean> getAllItems() {
		List<ItemEntity> entityList = repo.findAll();
		List<ItemBean> beanList = new ArrayList<>();
		BeanUtils.copyProperties(entityList, beanList);
		return beanList;
	}
	
	public int add(ItemBean bean) {
		ItemEntity entity = new ItemEntity();
		BeanUtils.copyProperties(bean, entity);
		System.out.print(entity.toString());
		entity = repo.save(entity);
		if(entity == null) return -1;
		return 0;
	}
	
}
