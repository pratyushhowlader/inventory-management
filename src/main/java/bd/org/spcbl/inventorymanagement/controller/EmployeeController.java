package bd.org.spcbl.inventorymanagement.controller;

import bd.org.spcbl.inventorymanagement.model.Employee;
import bd.org.spcbl.inventorymanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @RequestMapping("/all")
    public List<Employee> getAll(){
        return this.employeeService.getAll();
        //employees.forEach(System.out::println);



    }
}
