package ru.med.gastroapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.med.gastroapp.entities.*;
import ru.med.gastroapp.service.IConclusionService;
import java.util.ArrayList;

@Component
public class GastroApplication {

    @Autowired
    private IConclusionService conclusionService;

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
        cure.setCourse(new ArrayList<>());
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

        Conclusion conclusion = new Conclusion();
        conclusion.setPatient(patient);
        conclusion.setDisease(new ArrayList<>());
        conclusion.getDisease().add(disease);
        conclusionService.addNew(conclusion);

    }

}
