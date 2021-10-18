package com.example.demo.domain.pieces;

public class Camera {
	
	private Long id;
	private String model;
	private Double megapixels;
	public Camera(Long id, String model, Double megapixels) {
		this.id = id;
		this.model = model;
		this.megapixels = megapixels;
	}
	public Long getId() {
		return id;
	}
	public String getModel() {
		return model;
	}
	public Double getMegapixels() {
		return megapixels;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setMegapixels(Double megapixels) {
		this.megapixels = megapixels;
	}
	@Override
	public String toString() {
		return "Camera [id=" + id + ", model=" + model + ", megapixels=" + megapixels + "]";
	}

}
