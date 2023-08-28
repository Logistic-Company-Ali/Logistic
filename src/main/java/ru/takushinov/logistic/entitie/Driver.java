package ru.takushinov.logistic.entitie;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "drivers")
@NoArgsConstructor
@Data
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "name")
    private String name;
    @Column(name = "patronymic")
    private String patronymic;
//    @OneToOne
//    @JoinColumn(name = "truck_id")
//    private Truck truck;

    @ManyToMany
    @JoinTable(
            name="car_driver",
            joinColumns = @JoinColumn(name = "driver_id"),
            inverseJoinColumns = @JoinColumn(name="truck_id")
    )
    private List<Truck> trucks;

}
