package com.intrasoft.intl.json.merge.service;

import com.intrasoft.intl.json.merge.factory.ObjectFactory;
import com.intrasoft.intl.json.merge.model.atg.enums.ObjectTypesEnum;

/**
 * 
 * @author sorfanos
 *
 */
public class TransformationServiceImpl implements TransformationService{

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public <T> T transform(String data, Long type, ObjectFactory factory) {
		return (T) factory.get(ObjectTypesEnum.getById(type).getClazz(), data);
		
	}

}
