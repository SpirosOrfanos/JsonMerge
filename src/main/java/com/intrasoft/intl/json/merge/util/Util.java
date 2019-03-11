package com.intrasoft.intl.json.merge.util;

import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.Collectors;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.intrasoft.intl.json.merge.model.atg.pub.DynamicProperties;
import com.intrasoft.intl.json.merge.model.atg.pub.ExtraImages;
import com.intrasoft.intl.json.merge.model.atg.pub.Product;

public class Util {
	private static Gson gson = new Gson();
	private static GsonBuilder gsonBuilder = new GsonBuilder();

	static {
		gsonBuilder.serializeNulls();
		gsonBuilder.registerTypeAdapter(DynamicProperties.class, new DynamicPropertiesDeserializer());
		gsonBuilder.registerTypeAdapter(ExtraImages.class, new ExtraImagesDeserializer());
		gson = gsonBuilder.create();
	}

	public static Map<String, Method> getMethods(Object object) {
		return Arrays.asList(object.getClass().getDeclaredMethods()).stream()
			.collect(Collectors.toMap(Method::getName, x -> x));
	}

	public static <T> Object composer(String input, Class<?> clazz) {
		if (input == null || input.length() == 0) {
			return null;
		}
	
		return gson.fromJson(input, clazz);
	}

	public static String toJson(Object object) {
		return gson.toJson(object);
	}

	public static void addToCache(LinkedHashMap<String, List<Product>> cache, Product product) {
		if (cache.get(product.getId()) == null) {
			cache.put(product.getId(), new ArrayList<>());
			cache.get(product.getId()).add(product);
		} else {
			cache.get(product.getId()).add(product);
		}
	}

}
