package zha.idz.employmentoffice.service.vacancy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zha.idz.employmentoffice.model.Vacancy;
import zha.idz.employmentoffice.repository.VacancyRepository;

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
public class VacancyServiceImpl implements VacancyService {

    @Autowired
    VacancyRepository vacancyRepository;

    @Override
    public Vacancy create(Vacancy vacancy) {
        vacancy.setCreatedAt(LocalDateTime.now());
        vacancy.setUpdatedAt(LocalDateTime.now());
        return vacancyRepository.save(vacancy);
    }

    @Override
    public Vacancy get(String id) {
        return vacancyRepository.findById(id).orElse(null);
    }

    @Override
    public Vacancy update(Vacancy vacancy) {
        vacancy.setUpdatedAt(LocalDateTime.now());
        return vacancyRepository.save(vacancy);
    }

    @Override
    public Vacancy delete(String id) {
        Vacancy vacancy = this.get(id);
        vacancyRepository.delete(vacancy);
        return vacancy;
    }

    @Override
    public List<Vacancy> getAll() {
        return vacancyRepository.findAll();
    }
}
