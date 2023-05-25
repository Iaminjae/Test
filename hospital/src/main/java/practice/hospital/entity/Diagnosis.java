package practice.hospital.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "diagnosis")
public class Diagnosis {

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToOne
    @JoinColumn(name = "patient_id")
    private Patient patient;

    private LocalDateTime time;
}
