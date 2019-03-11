package  com.intrasoft.intl.json.merge.model.atg.pub;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ImageObject implements Serializable{

	@SerializedName("thumbnail")
	@Expose
	protected Object thumbnail;

	@SerializedName("image")
	@Expose
	protected String image;

	public Object getThumbnail() {
		return thumbnail;
	}

	public void setThumbnail(Object thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ImageObject [thumbnail=");
		builder.append(thumbnail).append("\n");
		builder.append(", image=");
		builder.append(image).append("\n");
		builder.append("]");
		return builder.toString();
	}

	
}