package com.intrasoft.intl.json.merge.util;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.collections4.CollectionUtils;

import com.intrasoft.intl.json.merge.model.atg.pub.*;


/**
 *
 */
public class ProductMerger {

	public static void merge(Product base, Product data) {

		if (data.getId() != null) {
			base.setId(data.getId());
		}
		if (data.getSapCategoryId() != null) {
			base.setSapCategoryId(data.getSapCategoryId());
		}
		if (data.getTitle() != null) {
			base.setTitle(data.getTitle());
		}
		if (CollectionUtils.isNotEmpty(data.getSiteID())) {
			base.setSiteID(data.getSiteID());
		}
		if (CollectionUtils.isNotEmpty(data.getVariants())) {
			base.setVariants(data.getVariants());
		}
		if (data.getContentProperties() != null) {
			if (base.getContentProperties() == null) {
				base.setContentProperties(data.getContentProperties());
			} else {
				merge(base.getContentProperties(), data.getContentProperties());
			}
		}

		if (data.getSpecsProperties() != null) {
			if (base.getSpecsProperties() == null) {
				base.setSpecsProperties(data.getSpecsProperties());
			} else {
				merge(base.getSpecsProperties(), data.getSpecsProperties());
			}
		}

		if (CollectionUtils.isEmpty(base.getChildSkus()) && CollectionUtils.isNotEmpty(data.getChildSkus())) {
			base.setChildSkus(data.getChildSkus());
			return;
		} else if (CollectionUtils.isEmpty(data.getChildSkus())) {
			return;
		} else if (!CollectionUtils.isEmpty(base.getChildSkus()) && CollectionUtils.isNotEmpty(data.getChildSkus())) {
			merge(base.getChildSkus(), data.getChildSkus());
		}
	}

	private static void merge(List<ChildSku> base, List<ChildSku> data) {
		List<ChildSku> itemsToMerge = new ArrayList<>();
		List<ChildSku> itemsToAdd = new ArrayList<>();
		itemsToMerge = data.stream().filter(itm -> base.contains(itm)).collect(Collectors.toList());
		itemsToAdd = data.stream().filter(itm -> !base.contains(itm)).collect(Collectors.toList());
		itemsToMerge.forEach(item -> {
			for (ChildSku sku : base) {
				if (sku.getSkuId().equals(item.getSkuId())) {
					merge(sku, item);
				} 
			}
		});
		base.addAll(itemsToAdd);		
	}

	private static void merge(DynamicProperties base, DynamicProperties data) {
		data.getProperties().forEach((k, v) -> base.getProperties().put(k, v));
	}
	
	private static void merge(ChildSku base, ChildSku data) {
		if (data.getSkuId() != null) {
			base.setSkuId(data.getSkuId());
		}
		if (data.getTitle() != null) {
			base.setTitle(data.getTitle());
		}
		if (data.getColor() != null) {
			base.setColor(data.getColor());
		}
		if (data.getSize() != null) {
			base.setSize(data.getSize());
		}
		if (data.getMediaProperties() != null) {
			if (base.getMediaProperties() == null) {
				base.setMediaProperties(data.getMediaProperties());
			} else {
				merge(base.getMediaProperties(), data.getMediaProperties());
			}
		}
	}
	
	private static void merge(MediaProperties base, MediaProperties data) {
		if (data.getHeroImage() != null) {
			base.setHeroImage(data.getHeroImage());
		}
		if (data.getThumbnailImage() != null) {
			base.setThumbnailImage(data.getThumbnailImage());
		}
		if (data.getVideo() != null) {
			base.setVideo(data.getVideo());
		}
		
		if(base.getExtraImages() == null) {
			base.setExtraImages(data.getExtraImages());
		} else if(data.getExtraImages()!=null) {
			merge(base.getExtraImages(), data.getExtraImages());
		}
	}
	
	private static void merge(ExtraImages base, ExtraImages data) {
		data.getProperties().forEach((k, v) -> base.getProperties().put(k, v));
	}
	
}


