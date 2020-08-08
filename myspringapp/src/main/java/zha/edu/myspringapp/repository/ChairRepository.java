package zha.edu.myspringapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import zha.edu.myspringapp.model.Chair;

@Repository
public interface ChairRepository extends MongoRepository<Chair, String> {
}
