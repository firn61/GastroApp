package ru.med.gastroapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.med.gastroapp.entities.*;
import ru.med.gastroapp.service.IPatientService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class GastroApplication {

    @Autowired
    private IPatientService patientService;

    public void testTask(){

        Drug drug = new Drug();
        drug.setName("Полисорб");
        drug.setCount(50);
        drug.setDosage(1000);

        Diet diet = new Diet();
        diet.setNum(1);

        Course course = new Course();
        course.setDrug(drug);
        course.setTime("за 15 минут до еды");
        course.setDuration("2 месяца");
        course.setCount("пол таблетки");

        Cure cure = new Cure();
        cure.setName("Лечение гастрита");
        cure.setCourse(new ArrayList<Course>());
        cure.getCourse().add(course);
        cure.setDiet(diet);

        Disease disease = new Disease();
        disease.setName("гастрит");
        disease.setCures(new ArrayList<>());
        disease.getCures().add(cure);

        Patient patient = new Patient();
        patient.setName("Sergey");
        patient.setSurname("Nemchinsky");
        patient.setGender("male");
        patient.setOmsNum("666");
        patient.setDiseases(new ArrayList<>());
        patient.getDiseases().add(disease);

        patientService.addNewPatient(patient);

        Patient patient1 = patientService.getPatient(1L);
        patient.getDiseases();
        System.out.println(patient1);

    }

}
