package com.example.service;

import java.util.List;

public interface CrudService<T> {
    List<T> findAll();
    void save(T entity);
    void update(T entity);
    void delete(int id);
}
