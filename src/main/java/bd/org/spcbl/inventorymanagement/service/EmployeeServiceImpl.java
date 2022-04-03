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
        return null;
    }

    @Override
    public Employee update(Long id, Employee employee) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Employee get(Long id) {
        return null;
    }

    @Override
    public List<Employee> getAll() {
        return this.employeeRepository.findAll();
    }
}
