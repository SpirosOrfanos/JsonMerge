package com.intrasoft.intl.json.merge.service;

import java.util.*;

import com.intrasoft.intl.json.merge.factory.ObjectFactory;
import com.intrasoft.intl.json.merge.factory.ProductFactory;
import com.intrasoft.intl.json.merge.model.atg.pub.Product;
import com.intrasoft.intl.json.merge.util.ProductMerger;
import com.intrasoft.intl.json.merge.util.Util;

/**
 * 
 * @author sorfanos
 *
 */
public class ProductServiceImpl implements ProductService<Object, Object> {
	private TransformationService transformationService = new TransformationServiceImpl();
	private LinkedHashMap<String, List<Product>> cache = new LinkedHashMap<>();
	private static final ObjectFactory<Product> productFactory = new ProductFactory();

	@Override
	public void createRepositoryFromJson(String data, Long type) {
		Product product = transformationService.transform(data, type, productFactory);
		Util.addToCache(cache, product);
	}
	@Override
	public void createRepositoryFromProducts(Set<List<Product>> products) {
		products.stream().forEach(list -> {
			list.forEach(product -> {
				Util.addToCache(cache, product);
			});			
		});
	}
	@Override
	public void createRepositoryFromProducts(List<Product> products) {
		products.forEach(product -> {
			Util.addToCache(cache, product);
		});
	}
	@Override
	public List<Product> reduce() {		
		List<Product> prods = new ArrayList<>();
		cache.forEach((k, v) -> {
			Product p = new Product();
			v.forEach(item -> {
				ProductMerger.merge(p, item);
			});
			prods.add(p);
		});
		return prods;
	}
	
	
}
