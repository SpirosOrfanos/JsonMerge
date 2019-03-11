package com.intrasoft.intl.json.merge.util;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.intrasoft.intl.json.merge.model.atg.pub.ValueTypeObject;

import java.util.ArrayList;
import java.util.List;

public enum PropertyValueType {

	STRING("string") {
		@Override
		public void populateValueTypeObject(JsonObject jsonObject, ValueTypeObject valueTypeObject) {
			JsonArray jsonValuesArray = jsonObject.get(PublicConstants.VALUE).getAsJsonArray();
			List<String> values = new ArrayList<>();
			for (int i = 0; i < jsonValuesArray.size(); i++) {
				JsonElement jsonValue = jsonValuesArray.get(i);
				values.add(jsonValue.getAsString());
			}
			valueTypeObject.setValue(values);
		}
	},
	BIG_STRING("big string") {
		@Override
		public void populateValueTypeObject(JsonObject jsonObject, ValueTypeObject valueTypeObject) {
			JsonArray jsonValuesArray = jsonObject.get(PublicConstants.VALUE).getAsJsonArray();
			List<String> values = new ArrayList<>();
			for (int i = 0; i < jsonValuesArray.size(); i++) {
				JsonElement jsonValue = jsonValuesArray.get(i);
				values.add(jsonValue.getAsString());
			}
			valueTypeObject.setValue(values);
		}

	},
	INT("int") {
		@Override
		public void populateValueTypeObject(JsonObject jsonObject, ValueTypeObject valueTypeObject) {
			JsonArray jsonValuesArray = jsonObject.get(PublicConstants.VALUE).getAsJsonArray();
			List<Integer> values = new ArrayList<>();
			for (int i = 0; i < jsonValuesArray.size(); i++) {
				JsonElement jsonValue = jsonValuesArray.get(i);
				values.add(jsonValue.getAsInt());
			}
			valueTypeObject.setValue(values);

		}
	},
	DOUBLE("double") {
		@Override
		public void populateValueTypeObject(JsonObject jsonObject, ValueTypeObject valueTypeObject) {
			JsonArray jsonValuesArray = jsonObject.get(PublicConstants.VALUE).getAsJsonArray();
			List<Double> values = new ArrayList<>();
			for (int i = 0; i < jsonValuesArray.size(); i++) {
				JsonElement jsonValue = jsonValuesArray.get(i);
				values.add(jsonValue.getAsDouble());
			}
			valueTypeObject.setValue(values);

		}
	},
	BOOLEAN("boolean") {
		@Override
		public void populateValueTypeObject(JsonObject jsonObject, ValueTypeObject valueTypeObject) {
			valueTypeObject.setValue(jsonObject.get(PublicConstants.VALUE).getAsBoolean());
		}
	};

	public static PropertyValueType getPropertyType(String str) {
		for (PropertyValueType type : PropertyValueType.values()) {
			if (type.getPropertyName().equalsIgnoreCase(str))
				return type;
		}
		return PropertyValueType.STRING;
	}

	private String propertyName;

	PropertyValueType(String propertyName) {
		this.propertyName = propertyName;
	}

	public String getPropertyName() {
		return propertyName;
	}


	public abstract void populateValueTypeObject(JsonObject jsonObject, ValueTypeObject valueTypeObject);
}
