package zha.edu.myspringapp.dao.chair;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import zha.edu.myspringapp.dao.chair.DaoChair;
import zha.edu.myspringapp.dao.datastorage.DataFake;
import zha.edu.myspringapp.model.Chair;

import java.util.List;

@Repository
public class DaoChairImpl implements DaoChair {

    @Autowired
    DataFake dataFake;

    @Override
    public Chair create(Chair chair) {
        return null;
    }

    @Override
    public Chair get(String id) {
        return null;
    }

    @Override
    public Chair update(Chair chair) {
        return null;
    }

    @Override
    public Chair delete(String id) {
        return null;
    }

    @Override
    public List<Chair> getAll() {
        return dataFake.getChairs();
    }
}
