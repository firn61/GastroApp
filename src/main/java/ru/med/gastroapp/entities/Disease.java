package ru.med.gastroapp.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="disease")
public class Disease {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="name")
    private String name;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Cure> cures;

    public Disease(long id, String name, List<Cure> cures) {
        this.id = id;
        this.name = name;
        this.cures = cures;
    }

    public Disease() {
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

    public List<Cure> getCures() {
        return cures;
    }

    public void setCures(List<Cure> cures) {
        this.cures = cures;
    }

    @Override
    public String toString() {
        return "Disease{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cures=" + cures +
                '}';
    }
}
