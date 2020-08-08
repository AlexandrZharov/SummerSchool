package zha.edu.myspringapp.service.group;

import zha.edu.myspringapp.model.Group;

import java.util.List;

public interface GroupService {
    Group create(Group chair);
    Group get(String id);
    Group update(Group chair);
    Group delete(String id);
    List<Group> getAll();
}
