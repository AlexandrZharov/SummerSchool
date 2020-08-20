package zha.idz.employmentoffice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import zha.idz.employmentoffice.model.Vacancy;

/**
 * @author Aleksandr Zharov
 * @version 1.0.0
 * Copyright (c) Aleksandr Zharov
 * Description:
 * @since 20 авг. 2020
 */
public interface VacancyRepository extends MongoRepository<Vacancy, String> {
}
