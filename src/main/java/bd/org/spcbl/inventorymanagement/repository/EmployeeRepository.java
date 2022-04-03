package bd.org.spcbl.inventorymanagement.repository;

import bd.org.spcbl.inventorymanagement.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
