package ru.med.gastroapp.entities;

import javax.persistence.*;

@Entity
@Table(name="drug")
public class Drug {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="name")
    private String name;
    @Column(name = "count")
    private Integer count;
    @Column(name="dosage")
    private Integer dosage;

    public Drug(long id, String name, Integer count, Integer dosage) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.dosage = dosage;
    }

    public Drug() {
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

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getDosage() {
        return dosage;
    }

    public void setDosage(Integer dosage) {
        this.dosage = dosage;
    }

    @Override
    public String toString() {
        return "Drug{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", dosage=" + dosage +
                '}';
    }
}
