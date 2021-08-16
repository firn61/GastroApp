package ru.med.gastroapp.dao;

import ru.med.gastroapp.entities.Patient;

public interface IPatientDAO {

    void save(Patient patient);

    Patient findById(long id);

    Patient findByName(String name);

}
