package ru.med.gastroapp.entities;

import javax.persistence.*;

@Entity
@Table(name="course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="name")
    private String name;
    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="drug_id", referencedColumnName = "id")
    private Drug drug;
    @Column(name="duration")
    private String duration;
    @Column(name="count")
    private String count;
    @Column(name="time")
    private String time;
    @Column(name="cure_id")
    private long cureId;

    public Course(long id, String name, Drug drug, String duration, String count, String time, long cureId) {
        this.id = id;
        this.name = name;
        this.drug = drug;
        this.duration = duration;
        this.count = count;
        this.time = time;
        this.cureId = cureId;
    }

    public Course() {
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

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public long getCureId() {
        return cureId;
    }

    public void setCureId(long cureId) {
        this.cureId = cureId;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", drug=" + drug +
                ", duration='" + duration + '\'' +
                ", count='" + count + '\'' +
                ", time='" + time + '\'' +
                ", cureId=" + cureId +
                '}';
    }
}
