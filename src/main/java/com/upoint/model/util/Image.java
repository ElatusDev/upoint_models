package com.upoint.model.util;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document
public class Image {
	
	@Id
	private Long id;
<<<<<<< HEAD
	
	private String bucketName;
	
	private String key;
	
=======
	private String bucketName;
	private String key;
>>>>>>> 3c61db79d39e73c63a840d46768a8c32edba28b7
	private String path;

}
