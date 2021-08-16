package ru.med.gastroapp.entities;

import javax.persistence.*;

@Entity
@Table(name="diet")
public class Diet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="num")
    private Integer num;

    public Diet(long id, String name, Integer num) {
        this.id = id;
        this.name = name;
        this.num = num;
    }

    public Diet() {
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

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Diet{" +
                "id=" + id +
                ", num=" + num +
                '}';
    }
}
