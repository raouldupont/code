package Tech.Raoul.sa.dao;

import Tech.Raoul.sa.model.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> get();
    Employee get(int id);
    void save(Employee employee);

    void delete(int id);

}
