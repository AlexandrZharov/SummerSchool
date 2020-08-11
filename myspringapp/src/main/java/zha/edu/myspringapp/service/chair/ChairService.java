package zha.edu.myspringapp.service.chair;

import zha.edu.myspringapp.model.Chair;

import java.util.List;

public interface ChairService {
    Chair create(Chair chair);
    Chair get(String id);
    Chair update(Chair chair);
    Chair delete(String id);
    List<Chair> getAll();
    void refresh();
}
