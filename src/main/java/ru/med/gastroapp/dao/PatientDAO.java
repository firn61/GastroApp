package ru.med.gastroapp.dao;

import org.springframework.stereotype.Repository;
import ru.med.gastroapp.entities.Patient;

@Repository
public class PatientDAO extends AbstractDAO<Patient> implements IPatientDAO<Patient>{

}
