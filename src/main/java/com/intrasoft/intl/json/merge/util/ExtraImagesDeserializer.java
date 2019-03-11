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

public class ExtraImagesDeserializer implements JsonDeserializer {

	@Override
	public Object deserialize(JsonElement jsonElement, Type type, JsonDeserializationContext jsonDeserializationContext)
		throws JsonParseException {

		JsonObject jsonObject = jsonElement.getAsJsonObject();
		ExtraImages extraImages = new ExtraImages();
		Map<String, ImageObject> properties = new HashMap<>();

		Set<Map.Entry<String, JsonElement>> entries = jsonObject.entrySet();
		for (Map.Entry<String, JsonElement> entry : entries) {
			JsonObject propertiesJsonObject = entry.getValue().getAsJsonObject();
			ImageObject imageObject = new ImageObject();
			String thumbnail = propertiesJsonObject.get(PublicConstants.THUMBNAIL).getAsString();
			String image = propertiesJsonObject.get(PublicConstants.IMAGE).getAsString();

			imageObject.setThumbnail(thumbnail);
			imageObject.setImage(image);
			properties.put(entry.getKey(), imageObject);
		}
		extraImages.setProperties(properties);

		return extraImages;
	}
}