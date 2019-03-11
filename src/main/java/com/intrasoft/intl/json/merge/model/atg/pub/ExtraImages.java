package  com.intrasoft.intl.json.merge.model.atg.pub;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.Map;

public class ExtraImages implements Serializable{
	@SerializedName("value")
	@Expose
	private Map<String, ImageObject> properties;

	public Map<String, ImageObject> getProperties() {
		return properties;
	}

	public void setProperties(Map<String, ImageObject> properties) {
		this.properties = properties;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ExtraImages [properties=");
		builder.append(properties).append("\n");
		builder.append("]");
		return builder.toString();
	}
	
	
}