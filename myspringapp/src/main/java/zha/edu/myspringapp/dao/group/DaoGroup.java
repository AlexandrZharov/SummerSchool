package zha.edu.myspringapp.dao.group;

import zha.edu.myspringapp.model.Group;

import java.util.List;

public interface DaoGroup {
    Group create(Group chair);
    Group get(String id);
    Group update(Group chair);
    Group delete(String id);
    List<Group> getAll();
}
