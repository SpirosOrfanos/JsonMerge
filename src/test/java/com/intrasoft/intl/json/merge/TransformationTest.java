package com.intrasoft.intl.json.merge;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.stream.Collectors;

import org.junit.BeforeClass;
import org.junit.Test;

import com.intrasoft.intl.json.merge.model.atg.pub.Product;
import com.intrasoft.intl.json.merge.service.ProductService;
import com.intrasoft.intl.json.merge.service.ProductServiceImpl;
import com.intrasoft.intl.json.merge.util.Util;

public class TransformationTest {

	private static List<StringBuilder> fileData;
	private static final String json = ".json"; 
	private static Properties props = new Properties();
	
	@SuppressWarnings("rawtypes")
	private static ProductService pro = null;
	@BeforeClass
	public static void init() throws IOException {
		
		fileData = new ArrayList<>();
		pro = new ProductServiceImpl();
		Files.list(Paths.get("src","test","resources")).filter((path) -> path.toString().endsWith(json)).collect(Collectors.toList())
		.forEach(item -> {
			StringBuilder builder = new StringBuilder();
			try {
				Files.lines(Paths.get(item.toString())).forEach(line -> {					
					builder.append(line.trim());
				});
				fileData.add(builder);
			} catch (IOException e) { }
		});
		/*.forEach(item -> {
			StringBuilder builder = new StringBuilder();
			try {
				Files.lines(Paths.get(item.toString())).forEach(line -> {					
					builder.append(line.trim());
				});
				fileData.add(builder);
			} catch (IOException e) { }
		})*/;
		/*StringBuilder builder = new StringBuilder();
		
		Files.lines(Paths.get(p1.toString())).forEach(line -> {					
			builder.append(line.trim());
		});
		fileData.add(builder);*/
      
	}
	@Test
	public void test01_Transform() {
		Product product = (Product)Util.composer(fileData.get(0).toString(), Product.class);
		assertEquals("100", product.getId());
		/*p = (Product)Util.composer(fileData.get(1).toString(), Product.class);
		System.out.println(p);*/
	}
	
	@Test
	public void test02_Merge() {
		fileData.forEach(input -> {
			pro.createRepositoryFromJson(input.toString(), 1L);
		});

		@SuppressWarnings({"unchecked" })
		List<Product> reduced = pro.reduce();	
		reduced.forEach(it -> System.out.println(it));
		assertEquals(reduced.size(), 3);	
		
	}
	
	@SuppressWarnings("unchecked")
	//@Test
	public void test03_ProductTitle( ) {
		List<Product> reduced = pro.reduce();	
		reduced.forEach(product -> {
			 if((product).getId().equals("1000")) 
					assertEquals((product).getSapCategoryId(), "3203001333");
		});
	}
	
}
