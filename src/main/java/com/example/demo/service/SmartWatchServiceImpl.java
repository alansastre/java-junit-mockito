package com.example.demo.service;

import com.example.demo.domain.SmartWatch;
import com.example.demo.domain.pieces.Battery;
import com.example.demo.domain.pieces.CPU;
import com.example.demo.domain.pieces.HealthMonitor;
import com.example.demo.domain.pieces.RAM;

import java.util.*;

public class SmartWatchServiceImpl implements SmartWatchService{

	/**
	 * Emulates a database with java hashmap
	 */
    private final Map<Long, SmartWatch> smartwatches = new HashMap<>();

    
    public SmartWatchServiceImpl() {
    	// demo data
		SmartWatch watch1 = new SmartWatch(1L, "Fitbit sense", 
				new RAM(1L, "DDR4", 2),
				new Battery(1L, 4500.0),
				new CPU(1L, 4),
				true,
				new HealthMonitor(1L, 0.0, 0));
		
		SmartWatch watch2 = new SmartWatch(2L, "Ticwatch", 
				new RAM(2L, "DDR3", 4),
				new Battery(2L, 4500.0),
				new CPU(2L, 4),
				true,
				new HealthMonitor(2L, 0.0, 0));
		
		SmartWatch watch3 = new SmartWatch(1L, "Samsung Galaxy Watch", 
				new RAM(3L, "DDR4", 2),
				new Battery(3L, 4500.0),
				new CPU(3L, 4),
				true,
				new HealthMonitor(3L, 0.0, 0));
		
		
		smartwatches.put(1L, watch1);
		smartwatches.put(2L, watch2);
    	smartwatches.put(3L, watch3);
    }

    @Override
    public Integer count() {
        return smartwatches.keySet().size();
    }

    @Override
    public List<SmartWatch> findAll() {
        return new ArrayList<>(smartwatches.values());
    }

    @Override
    public SmartWatch findOne(Long id) {
        return smartwatches.get(id);
    }

    @Override
    public SmartWatch save(SmartWatch smartwatch) {

        if (smartwatch.getId() == null || smartwatch.getId() == 0L) // nuevo smartphone
            smartwatch.setId(getMaxSmartWatchId() + 1);

        smartwatches.remove(smartwatch.getId()); // en caso de que ya exista lo quita para actualizarlo

        smartwatches.put(smartwatch.getId(), smartwatch);
        return smartwatch;
    }

    private Long getMaxSmartWatchId() {
        return Collections.max(smartwatches.entrySet(),
                (entry1, entry2) -> (int) (entry1.getKey() - entry2.getKey())
        ).getKey();
    }

    @Override
    public boolean delete(Long id) {
        if (id == null || !smartwatches.containsKey(id))
            return false;
        smartwatches.remove(id);
        return true;
    }

    @Override
    public void deleteAll() {
        if (!smartwatches.isEmpty())
            smartwatches.clear();
    }
}
