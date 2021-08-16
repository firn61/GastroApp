package ru.med.gastroapp.service;

public interface IBasicService<T> {

    void addNew(T t);

    void update(T t);

    void delete(T t);

    T getById(long id);

    T getByName(String name);

}
