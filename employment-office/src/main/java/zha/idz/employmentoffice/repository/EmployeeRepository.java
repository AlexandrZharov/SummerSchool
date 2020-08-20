package zha.idz.employmentoffice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import zha.idz.employmentoffice.model.Employee;

/**
 * @author Aleksandr Zharov
 * @version 1.0.0
 * Copyright (c) Aleksandr Zharov
 * Description:
 * @since 19 авг. 2020
 */
@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
