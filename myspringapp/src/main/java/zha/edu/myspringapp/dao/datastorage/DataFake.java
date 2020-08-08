package zha.edu.myspringapp.dao.datastorage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zha.edu.myspringapp.model.Chair;
import zha.edu.myspringapp.model.Group;
import zha.edu.myspringapp.repository.ChairRepository;
import zha.edu.myspringapp.repository.GroupRepository;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Repository
public class DataFake {

    @Autowired
    ChairRepository chairRepository;

    @Autowired
    GroupRepository groupRepository;

    List<Chair> chairs = new LinkedList<>(Arrays.asList(
            new Chair("IPZ", "Ivanov", "Engineering"),
            new Chair("KN", "Petrov", "MSOffice"),
            new Chair("IT", "Sidorov", "Something")
    ));

    List<Group> groups = new LinkedList<>(Arrays.asList(
            new Group("6.04.121.012.17.01", "IPZ", chairs.get(0)),
            new Group("8.04.122.010.19.2", "KN", chairs.get(1)),
            new Group("P-13", "DPZ", chairs.get(2))
    ));

    @PostConstruct
    private void init() {
        chairRepository.deleteAll();
        groupRepository.deleteAll();
        chairRepository.saveAll(chairs);
        groupRepository.saveAll(groups);
    }

    public List<Chair> getChairs() {
        return chairs;
    }

    public void setChairs(List<Chair> chairs) {
        this.chairs = chairs;
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}
