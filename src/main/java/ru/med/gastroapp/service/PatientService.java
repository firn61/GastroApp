package ru.med.gastroapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.med.gastroapp.dao.IPatientDAO;
import ru.med.gastroapp.entities.Patient;

@Service
@Transactional
public class PatientService extends AbstractService<Patient> implements IPatientService<Patient>{

    @Autowired
    public PatientService(IPatientDAO<Patient> patientDAO) {
        super(patientDAO);
    }

}
