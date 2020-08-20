package zha.idz.employmentoffice.service.employer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zha.idz.employmentoffice.model.Employer;
import zha.idz.employmentoffice.repository.EmployerRepository;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Aleksandr Zharov
 * @version 1.0.0
 * Copyright (c) Aleksandr Zharov
 * Description:
 * @since 20 авг. 2020
 */
@Service
public class EmployerServiceImpl implements EmployerService {

    @Autowired
    EmployerRepository employerRepository;

    @Override
    public Employer create(Employer employer) {
        employer.setCreatedAt(LocalDateTime.now());
        employer.setUpdatedAt(LocalDateTime.now());
        return employerRepository.save(employer);
    }

    @Override
    public Employer get(String id) {
        return employerRepository.findById(id).orElse(null);
    }

    @Override
    public Employer update(Employer employer) {
        employer.setUpdatedAt(LocalDateTime.now());
        return employerRepository.save(employer);
    }

    @Override
    public Employer delete(String id) {
        Employer employer = this.get(id);
        employerRepository.delete(employer);
        return employer;
    }

    @Override
    public List<Employer> getAll() {
        return employerRepository.findAll();
    }
}
