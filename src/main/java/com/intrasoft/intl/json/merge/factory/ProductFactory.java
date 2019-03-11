package com.intrasoft.intl.json.merge.factory;


import com.intrasoft.intl.json.merge.model.atg.pub.Product;
import com.intrasoft.intl.json.merge.util.Util;

public class ProductFactory implements ObjectFactory<Product>{

	@SuppressWarnings("unchecked")
	@Override
	public <T> T get(Class<T> type, String json) {
		return (T)Util.composer(json, type);
	}

}
