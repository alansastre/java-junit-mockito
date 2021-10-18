package com.example.demo.service;

import com.example.demo.domain.SmartDevice;

public class SmartDeviceFactory {
	
	private static final String PHONE = "phone";
	private static final String WATCH = "watch";

	private SmartDeviceFactory() {}

	public static SmartDevice createByType(String type) {
		
//		return switch (type) {
//			case PHONE -> SmartDeviceFacade.createSmartPhone();
//			case WATCH -> SmartDeviceFacade.createSmartWatch();
//			default -> throw new IllegalArgumentException("Unexpected value: " + type);
//		};
		
		switch (type) {
		case PHONE:
			return SmartDeviceFacade.createSmartPhone();
		case WATCH:
			return SmartDeviceFacade.createSmartWatch();
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
	}
	

}
