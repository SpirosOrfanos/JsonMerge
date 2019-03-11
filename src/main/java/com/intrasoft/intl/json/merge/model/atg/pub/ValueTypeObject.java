package  com.intrasoft.intl.json.merge.model.atg.pub;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class ValueTypeObject implements Serializable{
	@SerializedName("value")
	@Expose
	private Object value;

	@SerializedName("type")
	@Expose
	private String type;

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ValueTypeObject [value=");
		builder.append(value).append("\n");
		builder.append(", type=");
		builder.append(type).append("\n");
		builder.append("]");
		return builder.toString();
	}

}
