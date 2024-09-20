package com.upoint.model.util;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Component
@Document
public class Image {
	
	@Id
	private Long id;
	private String bucketName;
	private String key;
	private String path;

}
