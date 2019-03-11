package com.intrasoft.intl.json.merge.service;

import java.util.*;

import com.intrasoft.intl.json.merge.model.atg.pub.Product;

/**
 * 
 * @author sorfanos
 *
 * @param <V>
 * @param <K>
 */
public interface ProductService<V, K> {

	/**
	 * Add Product object to temp cache 
	 * @param data json format of an object (Product in our case)
	 * @param type the class type for reference
	 */
	public void createRepositoryFromJson(String data, Long type);
	/**
	 * Add Set of Lists of products in temp cache
	 * @param products
	 */
	public void createRepositoryFromProducts(Set<List<Product>> products);
	/**
	 * Add List of products in temp cache
	 * @param products
	 */
	public void createRepositoryFromProducts(List<Product> products);
	/**
	 * Merge the products
	 * @return
	 */
	public List<Product> reduce();
	
}
