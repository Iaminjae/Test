package practice.hospital.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Table(name = "depart")
public class Depart {

    @Id
    @Column(name = "depart_name")
    private String name;

    private int number;

    @OneToMany
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;
}
