package com.example.demo.domain.pieces;

public class HealthMonitor {

	private Long id;
	private Double bloodPressure;
	private Integer sleepQuality;
	public HealthMonitor(Long id, Double bloodPressure, Integer sleepQuality) {
		this.id = id;
		this.bloodPressure = bloodPressure;
		this.sleepQuality = sleepQuality;
	}
	public Long getId() {
		return id;
	}
	public Double getBloodPressure() {
		return bloodPressure;
	}
	public Integer getSleepQuality() {
		return sleepQuality;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setBloodPressure(Double bloodPressure) {
		this.bloodPressure = bloodPressure;
	}
	public void setSleepQuality(Integer sleepQuality) {
		this.sleepQuality = sleepQuality;
	}
	@Override
	public String toString() {
		return "HealthMonitor [id=" + id + ", bloodPressure=" + bloodPressure + ", sleepQuality=" + sleepQuality + "]";
	}
	
	
}
