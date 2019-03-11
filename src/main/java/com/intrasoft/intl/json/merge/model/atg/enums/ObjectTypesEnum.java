package com.intrasoft.intl.json.merge.model.atg.enums;
import com.intrasoft.intl.json.merge.model.atg.pub.*;
public enum ObjectTypesEnum {

	Product(1L, Product.class);

	ObjectTypesEnum(Long value, Class<?> clazz) {
		this.value = value;
		this.clazz = clazz;
	}

	private Long value;
	private Class<?> clazz;

	public Long getValue() {
		return value;
	}

	public Class<?> getClazz() {
		return clazz;
	}

	public static ObjectTypesEnum getById(Long value) {
		for (ObjectTypesEnum objectTypesEnum : values()) {
			if (value.equals(objectTypesEnum.getValue())) {
				return objectTypesEnum;
			}
		}
		return null;
	}
}