package com.example.stickyheadergridview;

public class GridItem {
	private String name;
	public GridItem(String name, String title) {
		super();
		this.name = name;
		this.title = title;
	}

	private String title="½»Í¨";
	private int section=1;
	
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public int getSection() {
		return section;
	}

	public void setSection(int section) {
		this.section = section;
	}

}
