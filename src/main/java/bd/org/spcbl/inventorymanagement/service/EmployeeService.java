package bd.org.spcbl.inventorymanagement.service;

import bd.org.spcbl.inventorymanagement.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);
    Employee update(Employee employee);
    void delete(Long id);
    Employee get(Long id);
    List<Employee> getAll();
}
