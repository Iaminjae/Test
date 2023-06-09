package practice.hospital.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    private Long id;

    private String name;
    private int age;
    private String gender;

    @OneToMany(mappedBy = "patient")
    List<Reservation> reservations = new ArrayList<>();


}
