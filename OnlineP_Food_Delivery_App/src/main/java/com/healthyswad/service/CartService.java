package com.healthyswad.service;

import com.healthyswad.model.FoodCart;

public interface CartService {

	public FoodCart addItemToCart(Integer itemId,String key)throws CustomerException;	

}
