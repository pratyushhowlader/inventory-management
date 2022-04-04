package bd.org.spcbl.inventorymanagement.service;

import bd.org.spcbl.inventorymanagement.model.Employee;
import bd.org.spcbl.inventorymanagement.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee save(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public Employee update(Employee employee) {
        return this.employeeRepository.save(employee);
    }

    @Override
    public void delete(Long id) {
        // Employee employee = this.employeeRepository.getById(id);
        Employee employee = this.employeeRepository.findById(id).get();
        if (employee != null) {
            this.employeeRepository.delete(employee);
        }
    }

    @Override
    public Employee get(Long id) {
        //Employee employee = this.employeeRepository.getById(id);
        Employee employee = this.employeeRepository.findById(id).get();

        return employee;

    }

    @Override
    public List<Employee> getAll() {
        return this.employeeRepository.findAll();
    }
}
