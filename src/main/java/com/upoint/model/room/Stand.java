package com.upoint.model.room;

import java.util.List;
import com.upoint.model.util.StandType;

public class Stand {

	private Long id;
	private String label;
	private StandType standType;
	private Integer maxColumn;
	private Integer maxRow;
	private List<Section> sections;
	
}
