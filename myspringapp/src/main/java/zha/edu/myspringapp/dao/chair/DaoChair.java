package zha.edu.myspringapp.dao.chair;

import zha.edu.myspringapp.model.Chair;

import java.util.List;

public interface DaoChair {
    Chair create(Chair chair);
    Chair get(String id);
    Chair update(Chair chair);
    Chair delete(String id);
    List<Chair> getAll();
}
