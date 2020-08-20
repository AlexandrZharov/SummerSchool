package zha.idz.employmentoffice.service.activity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zha.idz.employmentoffice.model.TypeOfActivity;
import zha.idz.employmentoffice.repository.TypeOfActivityRepository;

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
public class TypeOfActivityServiceImpl implements TypeOfActivityService {

    @Autowired
    TypeOfActivityRepository typeOfActivityRepository;

    @Override
    public TypeOfActivity create(TypeOfActivity typeOfActivity) {
        typeOfActivity.setCreatedAt(LocalDateTime.now());
        typeOfActivity.setUpdatedAt(LocalDateTime.now());
        return typeOfActivityRepository.save(typeOfActivity);
    }

    @Override
    public TypeOfActivity get(String id) {
        return typeOfActivityRepository.findById(id).orElse(null);
    }

    @Override
    public TypeOfActivity update(TypeOfActivity typeOfActivity) {
        typeOfActivity.setUpdatedAt(LocalDateTime.now());
        return typeOfActivityRepository.save(typeOfActivity);
    }

    @Override
    public TypeOfActivity delete(String id) {
        TypeOfActivity typeOfActivity = this.get(id);
        typeOfActivityRepository.delete(typeOfActivity);
        return typeOfActivity;
    }

    @Override
    public List<TypeOfActivity> getAll() {
        return typeOfActivityRepository.findAll();
    }
}
