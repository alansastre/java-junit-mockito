package com.example.demo.repository;

import com.example.demo.domain.Employee;

import java.util.*;

public class EmployeeRepositoryImpl implements EmployeeRepository{
    private final Map<Long, Employee> employees = new HashMap<>();

    public EmployeeRepositoryImpl() {

        // demo data
        Employee emp1 = new Employee(1L, "Emp 1", 30);
        Employee emp2 = new Employee(2L, "Emp 2", 40);
        Employee emp3 = new Employee(3L, "Emp 3", 50);

        employees.put(1L, emp1);
        employees.put(2L, emp2);
        employees.put(3L, emp3);
    }

    @Override
    public Integer count() {
        return employees.keySet().size();
    }

    @Override
    public List<Employee> findAll() {
        return new ArrayList<>(employees.values());
    }

    @Override
    public Employee findOne(Long id) {
        System.out.println("EmployeeRepositoryImpl ejecutando findOne para " + id);
        if (id == null) {
            throw new IllegalArgumentException("El ID no puede ser nulo !");
        }
        return employees.get(id);
    }

    @Override
    public Employee save(Employee employee) {
        // asignar un id
        if (employee.getId() == null || employee.getId() == 0L) // nuevo employee
            employee.setId(getMaxId() + 1); // genera id y lo asigna

        employees.remove(employee.getId());

        employees.put(employee.getId(), employee);
        return employee;
    }

    private Long getMaxId() {
        if (employees.isEmpty()) {
            return 0L;
        }

        return Collections.max(employees.entrySet(),
                (entry1, entry2) -> (int) (entry1.getKey() - entry2.getKey())
        ).getKey();
    }

    /**
     *
     */
    @Override
    public boolean delete(Long id) {
        if (id == null || !employees.containsKey(id))
            return false;
        employees.remove(id);
        return true;
    }

    @Override
    public void deleteAll() {
        if (!employees.isEmpty())
            employees.clear();
    }


}
