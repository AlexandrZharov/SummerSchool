package zha.edu.mysqlspring;

import org.springframework.data.annotation.Id;

import javax.persistence.GeneratedValue;

/**
 * @author Aleksandr Zharov
 * @version 1.0.0
 * Copyright (c) Aleksandr Zharov
 * Description:
 * @since 14 авг. 2020
 */
public class Genere {
    @Id
    @GeneratedValue
    private Long id;

}
