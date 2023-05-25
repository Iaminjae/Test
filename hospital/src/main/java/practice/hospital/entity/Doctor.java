package practice.hospital.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.MetaValue;

import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_id")
    private Long id;

    private String name;
    private Long career;

    @OneToMany
    @JoinColumn(name = "depart_id")
    private Depart depart;
}
