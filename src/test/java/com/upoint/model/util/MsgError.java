package com.upoint.model.util;

import org.springframework.stereotype.Component;

@Component
public class MsgError {

<<<<<<< HEAD
	private static final String INVALID_ID_ERR = "detached entity passed to persist: %1s";
=======
	private static  final String INVALID_ID_ERR = "detached entity passed to persist: %1s";
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
	
	public String getInvalidIdErr(String className) {
		return String.format(INVALID_ID_ERR, className);
	}
<<<<<<< HEAD
=======
	
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
}
