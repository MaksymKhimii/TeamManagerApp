package ua.khimii.TeamManagerApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.khimii.TeamManagerApp.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
