package com.intrasoft.intl.json.merge.service;

import com.intrasoft.intl.json.merge.factory.ObjectFactory;

/**
 * 
 * @author sorfanos
 *
 */

public interface TransformationService {

	public <T> T transform(String data, Long type, @SuppressWarnings("rawtypes") ObjectFactory factory);
}
