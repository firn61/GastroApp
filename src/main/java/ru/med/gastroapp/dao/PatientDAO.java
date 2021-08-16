package ru.med.gastroapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ru.med.gastroapp.entities.Patient;

@Repository
public class PatientDAO implements IPatientDAO{

    protected Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void save(Patient patient) {
        getSession().save(patient);
    }

    @Override
    public Patient findById(long id) {
        return getSession().get(Patient.class, id);
    }

    @Override
    public Patient findByName(String name) {
        return getSession().get(Patient.class, name);
    }
}
