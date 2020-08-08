package zha.edu.myspringapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import zha.edu.myspringapp.model.Group;

/**
 * @author Aleksandr Zharov
 * @version 1.0.0
 * Copyright (c) Aleksandr Zharov
 * Description:
 * @since 07 авг. 2020
 */
@Repository
public interface GroupRepository extends MongoRepository<Group, String> {
}
