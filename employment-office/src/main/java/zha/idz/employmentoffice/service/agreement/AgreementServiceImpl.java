package zha.idz.employmentoffice.service.agreement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zha.idz.employmentoffice.model.Agreement;
import zha.idz.employmentoffice.repository.AgreementRepository;

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
public class AgreementServiceImpl implements AgreementService {
    @Autowired
    AgreementRepository agreementRepository;

    @Override
    public Agreement create(Agreement agreement) {
        agreement.setCreatedAt(LocalDateTime.now());
        agreement.setUpdatedAt(LocalDateTime.now());
        return agreementRepository.save(agreement);
    }

    @Override
    public Agreement get(String id) {
        return agreementRepository.findById(id).orElse(null);
    }

    @Override
    public Agreement update(Agreement agreement) {
        agreement.setUpdatedAt(LocalDateTime.now());
        return agreementRepository.save(agreement);
    }

    @Override
    public Agreement delete(String id) {
        Agreement agreement = this.get(id);
        agreementRepository.delete(agreement);
        return agreement;
    }

    @Override
    public List<Agreement> getAll() {
        return agreementRepository.findAll();
    }
}
