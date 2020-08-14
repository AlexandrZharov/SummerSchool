package zha.edu.myspringapp.service.chair;

import zha.edu.myspringapp.model.Chair;

import java.util.List;

/**
 * @author Aleksandr Zharov
 * @version 1.0.0
 * Copyright (c) Aleksandr Zharov
 * Description:
 * @since 14 авг. 2020
 */
public interface ChairBusiness {
    Chair findTheBestChair();
    List<Chair> sortByName(String name, String order);
}
