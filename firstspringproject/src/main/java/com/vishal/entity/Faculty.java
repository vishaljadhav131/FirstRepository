package com.vishal.entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class Faculty {
	
	private int id;
	private String facName;
	private List<Subject> subjects;
	public Faculty(int id, String facName) {
		super();
		this.id = id;
		this.facName = facName;
	}
	
	

}
