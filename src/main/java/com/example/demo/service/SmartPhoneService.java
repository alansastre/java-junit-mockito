package com.example.demo.service;

import com.example.demo.domain.SmartPhone;

import java.util.List;

public interface SmartPhoneService {

	/**
	 * It returns total number of smartphones
	 * @return
	 */
    Integer count();

    /**
     * It retrieves all smartphones
     */
    List<SmartPhone> findAll();

    SmartPhone findOne(Long id);
    
    // Filtros
     List<SmartPhone> findByWifi(Boolean wifi);
     
    // List<SmartPhone> findByManufacturer(String manufacturer);

    SmartPhone save(SmartPhone smartphone);

    boolean delete(Long id);

    void deleteAll();
}
