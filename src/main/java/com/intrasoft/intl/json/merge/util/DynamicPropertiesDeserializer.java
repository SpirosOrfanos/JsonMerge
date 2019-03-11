package com.intrasoft.intl.json.merge.util;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.intrasoft.intl.json.merge.model.atg.pub.*;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DynamicPropertiesDeserializer implements JsonDeserializer {

	@Override
	public Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext)
		throws JsonParseException {

		JsonObject jsonObject = jsonElement.getAsJsonObject();
		DynamicProperties dynamicProperties = new DynamicProperties();
		Map<String, ValueTypeObject> properties = new HashMap<>();

		Set<Map.Entry<String, JsonElement>> entries = jsonObject.entrySet();
		for (Map.Entry<String, JsonElement> entry : entries) {
			JsonObject propertiesJsonObject = entry.getValue().getAsJsonObject();
			ValueTypeObject valueTypeObject = new ValueTypeObject();
			String propType = propertiesJsonObject.get(PublicConstants.TYPE).getAsString();

			PropertyValueType.getPropertyType(propType).populateValueTypeObject(propertiesJsonObject, valueTypeObject);

			valueTypeObject.setType(propType);
			properties.put(entry.getKey(), valueTypeObject);
		}
		dynamicProperties.setProperties(properties);

		return dynamicProperties;
	}
}