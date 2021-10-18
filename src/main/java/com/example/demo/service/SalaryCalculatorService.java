package com.example.demo.service;

import com.example.demo.domain.Employee;

public class SalaryCalculatorService {

    private final IRPFCalculator irpfCalculator;
    private final IVACalculator ivaCalculator;

    public SalaryCalculatorService(IRPFCalculator irpfCalculator, IVACalculator ivaCalculator) {
        this.irpfCalculator = irpfCalculator;
        this.ivaCalculator = ivaCalculator;
    }

    public double calculateSalary(Employee employee){
        double base = 30000;
        base += employee.getAge()* 100;
        base += this.irpfCalculator.calculateIRPF(base);
        base += this.ivaCalculator.calculateIVA(base);
        return base;
    }
}
