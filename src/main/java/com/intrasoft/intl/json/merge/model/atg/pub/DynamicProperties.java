package  com.intrasoft.intl.json.merge.model.atg.pub;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Map;

public class DynamicProperties implements Serializable{
	@SerializedName("value")
	@Expose(deserialize=true,serialize=true)
	private Map<String, ValueTypeObject> properties;

	public Map<String, ValueTypeObject> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, ValueTypeObject> properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("DynamicProperties [properties=");
		builder.append(properties).append("\n");
		builder.append("]");
		return builder.toString();
	}
	
}