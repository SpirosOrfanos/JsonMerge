
package  com.intrasoft.intl.json.merge.model.atg.pub;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MediaProperties implements Serializable{

	@SerializedName("heroImage")
	@Expose
	private String heroImage;

	@SerializedName("thumbnailImage")
	@Expose
	private String thumbnailImage;

	@SerializedName("video")
	@Expose
	private String video;

	@SerializedName("extraImages")
	@Expose
	private ExtraImages extraImages;

	public String getHeroImage() {
		return heroImage;
	}

	public void setHeroImage(String heroImage) {
		this.heroImage = heroImage;
	}

	public String getThumbnailImage() {
		return thumbnailImage;
	}

	public void setThumbnailImage(String thumbnailImage) {
		this.thumbnailImage = thumbnailImage;
	}

	public String getVideo() {
		return video;
	}

	public void setVideo(String video) {
		this.video = video;
	}

	public ExtraImages getExtraImages() {
		return extraImages;
	}

	public void setExtraImages(ExtraImages extraImages) {
		this.extraImages = extraImages;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("MediaProperties [heroImage=");
		builder.append(heroImage).append("\n");
		builder.append(", thumbnailImage=");
		builder.append(thumbnailImage).append("\n");
		builder.append(", video=");
		builder.append(video).append("\n");
		builder.append(", extraImages=");
		builder.append(extraImages).append("\n");
		builder.append("]");
		return builder.toString();
	}

	

}
