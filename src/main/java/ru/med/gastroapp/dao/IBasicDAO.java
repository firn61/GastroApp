package ru.med.gastroapp.dao;

import ru.med.gastroapp.entities.Drug;

public interface IBasicDAO<T>{

    void save(T drug);

    void merge(T drug);

    T findById(long id);

    T findByName(String name);

}
