package zha.edu.myspringapp.service.chair;

import zha.edu.myspringapp.model.Chair;
import zha.edu.myspringapp.service.IGenericService;

import java.util.List;

public interface ChairService extends IGenericService<Chair> {
    List<Chair> searchByName(String name);
    List<Chair> searchByString(String name);
    void refresh();
}
