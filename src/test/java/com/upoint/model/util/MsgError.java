package com.upoint.model.util;

import org.springframework.stereotype.Component;

@Component
public class MsgError {

	private static final String INVALID_ID_ERR = "detached entity passed to persist: %1s";

	public String getInvalidIdErr(String className) {
		return String.format(INVALID_ID_ERR, className);
	}
}
