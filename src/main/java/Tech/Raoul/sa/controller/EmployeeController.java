package Tech.Raoul.sa.controller;

import Tech.Raoul.sa.dao.EmployeeDAO;
import Tech.Raoul.sa.model.Employee;
import Tech.Raoul.sa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController{
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> get(){
        return employeeService.get();
    }
}
