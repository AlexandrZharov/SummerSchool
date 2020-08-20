package zha.idz.employmentoffice.service.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zha.idz.employmentoffice.model.Employee;
import zha.idz.employmentoffice.repository.EmployeeRepository;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Aleksandr Zharov
 * @version 1.0.0
 * Copyright (c) Aleksandr Zharov
 * Description:
 * @since 19 авг. 2020
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee create(Employee employee) {
        employee.setCreatedAt(LocalDateTime.now());
        employee.setUpdatedAt(LocalDateTime.now());
        return employeeRepository.save(employee);
    }

    @Override
    public Employee get(String id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public Employee update(Employee employee) {
        employee.setUpdatedAt(LocalDateTime.now());
        return employeeRepository.save(employee);
    }

    @Override
    public Employee delete(String id) {
        Employee employee = this.get(id);
        employeeRepository.delete(employee);
        return employee;
    }

    @Override
    public List<Employee> getAll() {
        return employeeRepository.findAll();
    }
}
