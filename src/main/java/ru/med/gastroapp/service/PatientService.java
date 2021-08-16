package ru.med.gastroapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.med.gastroapp.dao.IPatientDAO;
import ru.med.gastroapp.entities.Patient;

@Service
@Transactional
public class PatientService implements IPatientService{

    @Autowired
    IPatientDAO patientDAO;

    @Override
    public Patient getPatient(Long id) {
        return patientDAO.findById(id);
    }

    @Override
    @Transactional
    public void addNewPatient(Patient patient) {
        patientDAO.save(patient);
    }
}
