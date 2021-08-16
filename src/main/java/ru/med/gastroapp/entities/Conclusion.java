package ru.med.gastroapp.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="conlusion")
public class Conclusion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="name")
    private String name;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Patient patient;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.EAGER)
    private List<Disease> disease;
    @Column(name="comment")
    private String comment;

    public Conclusion(long id, String name, Patient patient, List<Disease> disease, String comment) {
        this.id = id;
        this.name = name;
        this.patient = patient;
        this.disease = disease;
        this.comment = comment;
    }

    public Conclusion() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<Disease> getDisease() {
        return disease;
    }

    public void setDisease(List<Disease> disease) {
        this.disease = disease;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Conclusion{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", patient=" + patient +
                ", disease=" + disease +
                ", comment='" + comment + '\'' +
                '}';
    }
}
