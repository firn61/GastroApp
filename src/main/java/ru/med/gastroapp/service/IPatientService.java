package ru.med.gastroapp.service;

import ru.med.gastroapp.entities.Patient;

public interface IPatientService {

    Patient getPatient(Long id);

    void addNewPatient(Patient patient);

}
