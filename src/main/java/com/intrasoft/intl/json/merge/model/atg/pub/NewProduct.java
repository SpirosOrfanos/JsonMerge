
package  com.intrasoft.intl.json.merge.model.atg.pub;

import java.io.Serializable;

public class NewProduct extends ValueTypeObject implements Serializable{

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("NewProduct [toString()=");
		builder.append(super.toString()).append("\n");
		builder.append("]");
		return builder.toString();
	}

}