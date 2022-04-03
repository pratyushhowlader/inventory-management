package bd.org.spcbl.inventorymanagement;

import bd.org.spcbl.inventorymanagement.model.Employee;
import bd.org.spcbl.inventorymanagement.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Configuration
public class DBInit {

    private final EmployeeRepository employeeRepository;

    public DBInit(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

   /* @PostConstruct
    public void init(){
        Employee employee = new Employee();
        employee.setName("Kabir");
        employee.setAddress("Gazipur");
        employee = this.employeeRepository.save(employee);
        System.out.println("The id is:"+ employee.getId());
    }*/
}
