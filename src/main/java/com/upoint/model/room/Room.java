package com.upoint.model.room;

import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Room {

	private List<Area> areas;

}
