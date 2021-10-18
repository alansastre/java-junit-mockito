package com.example.demo.service;

import com.example.demo.domain.Employee;
import com.example.demo.repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Integer count() {
        return this.employeeRepository.count();
    }

    @Override
    public List<Employee> findAll() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee findOne(Long id) {
        return this.employeeRepository.findOne(id);
    }

    @Override
    public Optional<Employee> findOneOptional(Long id) {

        try{
            return Optional.of(this.employeeRepository.findOne(id));
        }catch(IllegalArgumentException e){
            e.printStackTrace();
        }

        return Optional.empty();
    }

    @Override
    public Employee save(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public boolean delete(Long id) {
        return this.employeeRepository.delete(id);
    }

    @Override
    public void deleteAll() {
        this.employeeRepository.deleteAll();
    }
}
