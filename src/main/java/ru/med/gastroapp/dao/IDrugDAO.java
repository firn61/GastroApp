package ru.med.gastroapp.dao;

import ru.med.gastroapp.entities.Drug;

public interface IDrugDAO {

    void save(Drug drug);

    void merge(Drug drug);

    Drug findById(long id);

    Drug findByName(String name);

}
