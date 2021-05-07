package com.tyss.ecommercerest.service;

import java.util.List;

import com.tyss.ecommercerest.bean.Admin;
import com.tyss.ecommercerest.bean.Item;

public interface FlipcartService {

	public Admin authenticate(Integer id, String password);
	
	public boolean addItem(Item item);
	
	public boolean removeItem(Integer id);
	
	public Item searchItem(Integer id);
	
	public List<Item> getAllItems();
	
	public boolean updateItem(Item item);
}