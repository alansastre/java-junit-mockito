package com.example.demo.service;

import com.example.demo.domain.SmartPhone;
import com.example.demo.domain.pieces.Battery;
import com.example.demo.domain.pieces.CPU;
import com.example.demo.domain.pieces.Camera;
import com.example.demo.domain.pieces.RAM;

import java.util.*;
import java.util.Map.Entry;

public class SmartPhoneServiceImpl implements SmartPhoneService{

    private final Map<Long, SmartPhone> smartphones = new HashMap<>();
    
	public SmartPhoneServiceImpl() {
		System.out.println("inicializando SmartPhoneServiceImpl");
		// demo data
		SmartPhone phone1 = new SmartPhone(1L, "One plus 9", 
				new RAM(1L, "DDR4", 8),
				new Battery(1L, 4500.0),
				new CPU(1L, 4),
				false,
				new Camera(1L, "front camera", 12.5));
		
		SmartPhone phone2 = new SmartPhone(2L, "IPhone X", 
				new RAM(2L, "DDR3", 4),
				new Battery(2L, 3500.0),
				new CPU(2L, 2),
				true,
				new Camera(2L, "front camera", 8.5));
		
		SmartPhone phone3 = new SmartPhone(3L, "Samsung Galaxy 54", 
				new RAM(3L, "DDR5", 32),
				new Battery(3L, 9500.0),
				new CPU(3L, 16),
				true,
				new Camera(3L, "back camera", 58.5));
		
		
		smartphones.put(1L, phone1);
		smartphones.put(2L, phone2);
    	smartphones.put(3L, phone3);
	}

    @Override
    public Integer count() {
        return smartphones.keySet().size();
    }

    @Override
    public List<SmartPhone> findAll() {
        return new ArrayList<>(smartphones.values());
    }

    @Override
    public SmartPhone findOne(Long id) {
    	if (id == null) {
			throw new IllegalArgumentException("El ID no puede ser nulo !");
		}
        return smartphones.get(id);
    }

    @Override
    public SmartPhone save(SmartPhone smartphone) {
    	// asignar un id
        if (smartphone.getId() == null || smartphone.getId() == 0L) // nuevo smartphone
            smartphone.setId(getMaxSmartPhoneId() + 1); // genera id y lo asigna 

        // en caso de actualizar primero lo eliminamos
        smartphones.remove(smartphone.getId()); // en caso de que ya exista lo quita para actualizarlo

        // guarda el smartphone en el mapa
        smartphones.put(smartphone.getId(), smartphone);
        return smartphone;
    }

    /**
     * Devuelve el id más alto del mapa smartphones
     * @return
     */
    private Long getMaxSmartPhoneId() {
    	if (smartphones.isEmpty()) {
    		return 0L;
    	}
    		

        return Collections.max(smartphones.entrySet(),
                (entry1, entry2) -> (int) (entry1.getKey() - entry2.getKey())
        ).getKey();
    }

    /**
     * 
     */
    @Override
    public boolean delete(Long id) {
        if (id == null || !smartphones.containsKey(id))
            return false;
        smartphones.remove(id);
        return true;
    }

    @Override
    public void deleteAll() {
        if (!smartphones.isEmpty())
            smartphones.clear();
    }

	@Override
	public List<SmartPhone> findByWifi(Boolean wifi) {
		List<SmartPhone> results = new ArrayList<>();
		
		// 1. iterar sobre las claves
		for(Long id : smartphones.keySet())
			System.out.println(id);
		
		// 2. iterar sobre los valores
		for(SmartPhone phone : smartphones.values())
			if(phone.getWifi().equals(wifi))
				results.add(phone);
		
		// 3. iterar sobre el par completo
		for (Entry<Long, SmartPhone> entry : smartphones.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

		
		return results;

	}

}
