package practice.hospital.entity;

import javax.persistence.*;

@Entity
@Table(name = "diagnosis")
public class Diagnosis {

    @OneToMany
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @OneToMany
    @JoinColumn(name = "patient_id")
    private Patient patient;

    private int time;
}
