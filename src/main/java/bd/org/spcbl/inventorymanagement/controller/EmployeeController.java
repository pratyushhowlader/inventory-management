package bd.org.spcbl.inventorymanagement.controller;

import bd.org.spcbl.inventorymanagement.model.Employee;
import bd.org.spcbl.inventorymanagement.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/{id}")
    public Employee get(@PathVariable(name = "id") Long id){
        return this.employeeService.get(id);
    }
    @GetMapping("/all")
    public List<Employee> getAll(){
        return this.employeeService.getAll();
        //employees.forEach(System.out::println);
    }
    @PostMapping("/save")
    public Employee save(@RequestBody Employee employee){
        return this.employeeService.save(employee);
    }
    @PutMapping("/update")
    public Employee update(@RequestBody Employee employee){
        return this.employeeService.save(employee);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") Long id){
        this.employeeService.delete(id);
    }

}
