package com.example.demo.domain.pieces;

public class RAM {
	
	private Long id;
	private String type;
	private Integer gigabytes;
	public RAM(Long id, String type, Integer gigabytes) {
		this.id = id;
		this.type = type;
		this.gigabytes = gigabytes;
	}
	public Long getId() {
		return id;
	}
	public String getType() {
		return type;
	}
	public Integer getGigabytes() {
		return gigabytes;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setGigabytes(Integer gigabytes) {
		this.gigabytes = gigabytes;
	}
	@Override
	public String toString() {
		return "RAM [id=" + id + ", type=" + type + ", gigabytes=" + gigabytes + "]";
	}

	
}
