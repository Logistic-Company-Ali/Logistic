package ru.takushinov.logistic.entitie;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "truck_types")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class TruckType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "type")
    private String type;
    @Column(name = "tariff_by_km")
    private Integer tariffByKm;
    @Column(name = "tariff_by_hour")
    private Integer tariffByHour;
    @OneToMany(mappedBy = "truckType")
    private List<Truck> trucks;

}
