package ru.med.gastroapp.Entities;

import java.util.List;

public class Patient {
    private long id;
    private String name;
    private String midName;
    private String surname;
    private String gender;
    private String dateOfBirth;
    private String omsNum;
    private List<Disease> diseases;
}
