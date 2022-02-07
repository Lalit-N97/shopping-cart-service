package com.lnsteps.cart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lnsteps.cart.entity.ItemEntity;

public interface ItemRepository extends JpaRepository<ItemEntity, Long>{

}
