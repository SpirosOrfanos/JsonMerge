
package  com.intrasoft.intl.json.merge.model.atg.pub;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SpecsProperties implements Serializable{

    @Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("SpecsProperties [specKey1=");
		builder.append(specKey1).append("\n");
		builder.append("]");
		return builder.toString();
	}

	@SerializedName("specKey1")
    @Expose
    private String specKey1;

    public String getSpecKey1() {
        return specKey1;
    }

    public void setSpecKey1(String specKey1) {
        this.specKey1 = specKey1;
    }

   

}
