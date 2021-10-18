package com.example.demo.domain.pieces;

public class CPU {
	
	private Long id;
	private Boolean on = false;
	private Integer cores;
	public CPU(Long id, Integer cores) {
		this.id = id;
		this.cores = cores;
	}
	
	public void start() {
		this.on = true;
	}
	
	public Long getId() {
		return id;
	}
	public Boolean getOn() {
		return on;
	}
	public Integer getCores() {
		return cores;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setOn(Boolean on) {
		this.on = on;
	}
	public void setCores(Integer cores) {
		this.cores = cores;
	}
	@Override
	public String toString() {
		return "CPU [id=" + id + ", on=" + on + ", cores=" + cores + "]";
	}

}
