package ru.med.gastroapp.dao;

public interface IBasicDAO<T>{

    void save(T t);

    void merge(T t);

    void delete(T t);

    T findById(long id);

    T findByName(String name);

}
