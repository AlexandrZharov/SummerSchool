package zha.edu.myspringapp.service;

import zha.edu.myspringapp.model.Chair;

import java.util.List;

/**
 * @author Aleksandr Zharov
 * @version 1.0.0
 * Copyright (c) Aleksandr Zharov
 * Description:
 * @since 14 авг. 2020
 */
public interface IGenericService<T> {
    T create(T chair);
    T get(String id);
    T update(T chair);
    T delete(String id);
    List<T> getAll();
}
