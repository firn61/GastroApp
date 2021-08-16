package ru.med.gastroapp.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="cure")
public class Cure {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "name")
    private String name;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn()
    private Diet diet;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = false, fetch = FetchType.EAGER)
    private List<Course> course;

    public Cure(long id, String name, Diet diet, long diseaseId, List<Course> course) {
        this.id = id;
        this.name=name;
        this.diet = diet;
        this.course = course;
    }

    public Cure() {
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

    public Diet getDiet() {
        return diet;
    }

    public void setDiet(Diet diet) {
        this.diet = diet;
    }

    public List<Course> getCourse() {
        return course;
    }

    public void setCourse(List<Course> course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Cure{" +
                "id=" + id +
                ", diet=" + diet +
                ", course=" + course +
                '}';
    }
}
