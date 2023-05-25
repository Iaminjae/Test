package practice.hospital.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Getter @Setter
@Table(name = "reservation")
public class Reservation {

    @OneToMany
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @OneToMany
    @JoinColumn(name = "patient_id")
    private Patient patient;

    private int time;
}
