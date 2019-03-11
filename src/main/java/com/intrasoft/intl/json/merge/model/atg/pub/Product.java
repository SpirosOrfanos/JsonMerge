
package  com.intrasoft.intl.json.merge.model.atg.pub;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product implements Serializable{

    @SerializedName("id")
    @Expose
    private String id;

    @SerializedName("sapCategoryId")
    @Expose
    private String sapCategoryId;

    @SerializedName("siteID")
    @Expose
    private List<String> siteID;

    @SerializedName("title")
    @Expose
    private String title;

    @SerializedName("variants")
    @Expose
    private List<String> variants;

    @SerializedName("contentProperties")
    @Expose(deserialize=true,serialize=true)
    private DynamicProperties contentProperties;

    @SerializedName("specsProperties")
    @Expose
    private DynamicProperties specsProperties;

    @SerializedName("childSkus")
    @Expose
    private List<ChildSku> childSkus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSapCategoryId() {
        return sapCategoryId;
    }

    public void setSapCategoryId(String sapCategoryId) {
        this.sapCategoryId = sapCategoryId;
    }

    public List<String> getSiteID() {
        return siteID;
    }

    public void setSiteID(List<String> siteID) {
        this.siteID = siteID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getVariants() {
        return variants;
    }

    public void setVariants(List<String> variants) {
        this.variants = variants;
    }

    public DynamicProperties getContentProperties() {
        return contentProperties;
    }

    public void setContentProperties(DynamicProperties contentProperties) {
        this.contentProperties = contentProperties;
    }

    public DynamicProperties getSpecsProperties() {
        return specsProperties;
    }

    public void setSpecsProperties(DynamicProperties specsProperties) {
        this.specsProperties = specsProperties;
    }

    public List<ChildSku> getChildSkus() {
        return childSkus;
    }

    public void setChildSkus(List<ChildSku> childSkus) {
        this.childSkus = childSkus;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		Product other = (Product) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [id=");
		builder.append(id).append("\n");
		builder.append(", sapCategoryId=");
		builder.append(sapCategoryId).append("\n");
		builder.append(", siteID=");
		builder.append(siteID).append("\n");
		builder.append(", title=");
		builder.append(title).append("\n");
		builder.append(", variants=");
		builder.append(variants).append("\n");
		builder.append(", contentProperties=");
		builder.append(contentProperties).append("\n");
		builder.append(", specsProperties=");
		builder.append(specsProperties).append("\n");
		builder.append(", childSkus=");
		builder.append(childSkus).append("\n");
		builder.append("]");
		return builder.toString();
	}

    

}
