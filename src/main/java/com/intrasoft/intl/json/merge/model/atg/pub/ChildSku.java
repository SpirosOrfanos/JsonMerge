
package  com.intrasoft.intl.json.merge.model.atg.pub;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChildSku implements Serializable{

    @SerializedName("skuId")
    @Expose
    private String skuId;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("color")
    @Expose
    private String color;

    @SerializedName("size")
    @Expose
    private String size;

	@SerializedName("mediaProperties")
	@Expose
	private MediaProperties mediaProperties;

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

	public MediaProperties getMediaProperties() {
		return mediaProperties;
	}

	public void setMediaProperties(MediaProperties mediaProperties) {
		this.mediaProperties = mediaProperties;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((skuId == null) ? 0 : skuId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChildSku other = (ChildSku) obj;
		if (skuId == null) {
			if (other.skuId != null)
				return false;
		} else if (!skuId.equals(other.skuId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ChildSku [skuId=");
		builder.append(skuId).append("\n");
		builder.append(", title=");
		builder.append(title).append("\n");
		builder.append(", color=");
		builder.append(color).append("\n");
		builder.append(", size=");
		builder.append(size).append("\n");
		builder.append(", mediaProperties=");
		builder.append(mediaProperties).append("\n");
		builder.append("]");
		return builder.toString();
	}

	

}
