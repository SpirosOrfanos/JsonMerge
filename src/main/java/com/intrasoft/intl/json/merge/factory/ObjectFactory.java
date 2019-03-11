package com.intrasoft.intl.json.merge.factory;

public interface ObjectFactory <T> {
	@SuppressWarnings("hiding")
	public <T> T get(final Class<T> type, final String json);

}
