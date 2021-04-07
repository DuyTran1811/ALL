package com.codegym.service.iml;

public interface IGeneral<T> {
    Iterable<T> findAll();

    T findById(Long id);

    void save(T t);

    void remove(Long id);

    Iterable<T> findName(T t);
}
