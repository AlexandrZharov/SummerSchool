package zha.edu.myspringapp.service.chair;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zha.edu.myspringapp.dao.chair.DaoChair;
import zha.edu.myspringapp.dao.datastorage.DataFake;
import zha.edu.myspringapp.model.Chair;
import zha.edu.myspringapp.repository.ChairRepository;

import java.time.LocalDateTime;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ChairServiceImpl implements ChairService, ChairBusiness {

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
    public List<Chair> searchByName(String name) {
        return chairRepository.findAllByName(name);
        /*return this.getAll()
                .stream()
                .filter(chair -> chair.getName().equals(name))
                .collect(Collectors.toList());*/
    }

    @Override
    public List<Chair> searchByString(String name) {
        return chairRepository.findAllByNameContains(name);
        /*return this.getAll()
                .stream()
                .filter(chair -> chair.getName().contains(name))
                .collect(Collectors.toList());*/
    }

    @Override
    public void refresh() {
        chairRepository.deleteAll();
        chairRepository.saveAll(dataFake.getChairs());
    }

    @Override
    public Chair findTheBestChair() {
        return null;
    }

    @Override
    public List<Chair> sortByName(String name, String order) {
        return this.getAll()
                .stream()
                .filter(chair -> chair.getName().contains(name))
                .sorted(order == "ASC" ? Comparator.comparing(Chair::getName) : Comparator.comparing(Chair::getName).reversed())
                .collect(Collectors.toList());
    }
}
