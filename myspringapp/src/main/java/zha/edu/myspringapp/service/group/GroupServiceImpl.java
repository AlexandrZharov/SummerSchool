package zha.edu.myspringapp.service.group;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import zha.edu.myspringapp.dao.group.DaoGroup;
import zha.edu.myspringapp.model.Chair;
import zha.edu.myspringapp.model.Group;
import zha.edu.myspringapp.repository.GroupRepository;

import java.time.LocalDateTime;
import java.util.List;
@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    GroupRepository groupRepository;

    @Override
    public Group create(Group group) {
        group.setCreatedAt(LocalDateTime.now());
        group.setUpdatedAt(LocalDateTime.now());
        return groupRepository.save(group);
    }

    @Override
    public Group get(String id) {
        return groupRepository.findById(id).orElse(null);
    }

    @Override
    public Group update(Group group) {
        group.setUpdatedAt(LocalDateTime.now());
        return groupRepository.save(group);
    }

    @Override
    public Group delete(String id) {
        Group group = this.get(id);
        groupRepository.delete(group);
        return group;
    }

    @Override
    public List<Group> getAll() {
        return groupRepository.findAll();
    }
}
