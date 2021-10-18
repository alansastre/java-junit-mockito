package com.example.demo.domain;

import com.example.demo.domain.pieces.Battery;
import com.example.demo.domain.pieces.CPU;
import com.example.demo.domain.pieces.RAM;

public abstract class SmartDevice {

	private Long id;
	private String name;
	private RAM ram;
	private Battery battery;
	private CPU cpu;
	private Boolean wifi;

	protected SmartDevice() {
		
	}
	protected SmartDevice(Long id, String name, RAM ram, Battery battery, CPU cpu, Boolean wifi) {
		this.id = id;
		this.name = name;
		this.ram = ram;
		this.battery = battery;
		this.cpu = cpu;
		this.wifi = wifi;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public RAM getRam() {
		return ram;
	}

	public Battery getBattery() {
		return battery;
	}

	public CPU getCpu() {
		return cpu;
	}

	public Boolean getWifi() {
		return wifi;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRam(RAM ram) {
		this.ram = ram;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}

	public void setCpu(CPU cpu) {
		this.cpu = cpu;
	}

	public void setWifi(Boolean wifi) {
		this.wifi = wifi;
	}

	@Override
	public String toString() {
		return "SmartDevice [id=" + id + ", name=" + name + ", ram=" + ram + ", battery=" + battery + ", cpu=" + cpu
				+ ", wifi=" + wifi + "]";
	}

}
