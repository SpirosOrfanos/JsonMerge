
package  com.intrasoft.intl.json.merge.model.atg.pub;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ContentProperties implements Serializable{

    @Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ContentProperties [longDescription=");
		builder.append(longDescription).append("\n");
		builder.append(", shortDescription=");
		builder.append(shortDescription).append("\n");
		builder.append(", bestSeller=");
		builder.append(bestSeller).append("\n");
		builder.append(", newProduct=");
		builder.append(newProduct).append("\n");
		builder.append("]");
		return builder.toString();
	}

	@SerializedName("longDescription")
    @Expose
    private LongDescription longDescription;

    @SerializedName("shortDescription")
    @Expose
    private ShortDescription shortDescription;

    @SerializedName("bestSeller")
    @Expose
    private BestSeller bestSeller;

    @SerializedName("newProduct")
    @Expose
    private NewProduct newProduct;

    public LongDescription getLongDescription() {
        return longDescription;
    }

    public void setLongDescription(LongDescription longDescription) {
        this.longDescription = longDescription;
    }

    public ShortDescription getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(ShortDescription shortDescription) {
        this.shortDescription = shortDescription;
    }

    public BestSeller getBestSeller() {
        return bestSeller;
    }

    public void setBestSeller(BestSeller bestSeller) {
        this.bestSeller = bestSeller;
    }

    public NewProduct getNewProduct() {
        return newProduct;
    }

    public void setNewProduct(NewProduct newProduct) {
        this.newProduct = newProduct;
    }

  

}
