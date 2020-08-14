package zha.edu.myspringapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import zha.edu.myspringapp.model.Chair;

import java.util.List;

@Repository
public interface ChairRepository extends MongoRepository<Chair, String> {
    List<Chair> findAllByName(String name);
    List<Chair> findAllByNameAndDescription(String name, String description);
    List<Chair> findAllByNameContains(String name);

}
