package zha.edu.myspringapp.dao.group;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zha.edu.myspringapp.dao.datastorage.DataFake;
import zha.edu.myspringapp.model.Group;

import java.util.List;
@Repository
public class DaoGroupImpl implements DaoGroup {
    @Autowired
    DataFake dataFake;

    @Override
    public Group create(Group chair) {
        return null;
    }

    @Override
    public Group get(String id) {
        return null;
    }

    @Override
    public Group update(Group chair) {
        return null;
    }

    @Override
    public Group delete(String id) {
        return null;
    }

    @Override
    public List<Group> getAll() {
        return dataFake.getGroups();
    }
}
