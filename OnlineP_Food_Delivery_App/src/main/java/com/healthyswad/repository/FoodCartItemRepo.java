package com.healthyswad.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.healthyswad.model.FoodCart;
import com.healthyswad.model.FoodCartItems;
import com.healthyswad.model.Item;


public interface FoodCartItemRepo extends JpaRepository<FoodCartItems, Integer>{
	
	@Query("select f from FoodCartItems f where f.fc = ?1 AND f.item = ?2")
	public FoodCartItems sameItem(FoodCart cart, Item item);
	

	public List<FoodCartItems> findByFc(FoodCart cart);
	
	public void deleteByFc(FoodCart cart);
	
}
