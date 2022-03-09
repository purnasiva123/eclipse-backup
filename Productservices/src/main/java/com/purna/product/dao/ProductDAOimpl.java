package com.purna.product.dao;

import java.util.HashMap;
import java.util.Map;

import com.purna.product.dto.Product;

public class ProductDAOimpl implements ProductDAO {
	Map<Integer,Product> products = new HashMap<>();

	@Override
	public void create(Product product) {
		products.put(product.getId(), product);

	}

	@Override
	public Product read(int Id) {
		return products.get(Id);
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub

	}

}
