package zha.idz.employmentoffice.service;

import java.util.List;

/**
 * @author Aleksandr Zharov
 * @version 1.0.0
 * Copyright (c) Aleksandr Zharov
 * Description:
 * @since 19 авг. 2020
 */
public interface GenericService<T> {
    T create(T t);
    T get(String id);
    T update(T t);
    T delete(String id);
    List<T> getAll();
}
