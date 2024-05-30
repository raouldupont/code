package Tech.Raoul.sa.service;

import Tech.Raoul.sa.model.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> get();
    Employee get(int id);
    void save(Employee employee);

    void delete(int id);
}
