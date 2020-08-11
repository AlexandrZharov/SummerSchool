package zha.edu.myspringapp.service.chair;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zha.edu.myspringapp.dao.chair.DaoChair;
import zha.edu.myspringapp.dao.datastorage.DataFake;
import zha.edu.myspringapp.model.Chair;
import zha.edu.myspringapp.repository.ChairRepository;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class ChairServiceImpl implements ChairService {

    @Autowired
    ChairRepository chairRepository;

    @Autowired
    DataFake dataFake;

    @Override
    public Chair create(Chair chair) {
        chair.setCreatedAt(LocalDateTime.now());
        chair.setUpdatedAt(LocalDateTime.now());
        return chairRepository.save(chair);
    }

    @Override
    public Chair get(String id) {
        return chairRepository.findById(id).orElse(null);
    }

    @Override
    public Chair update(Chair chair) {
        chair.setUpdatedAt(LocalDateTime.now());
        return chairRepository.save(chair);
    }

    @Override
    public Chair delete(String id) {
        Chair chair = this.get(id);
        chairRepository.delete(chair);
        return chair;
    }

    @Override
    public List<Chair> getAll() {
        return chairRepository.findAll();
    }

    @Override
    public void refresh() {
        chairRepository.deleteAll();
        chairRepository.saveAll(dataFake.getChairs());
    }
}
