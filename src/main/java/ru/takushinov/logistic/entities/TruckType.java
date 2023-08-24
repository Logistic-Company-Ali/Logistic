package ru.takushinov.logistic.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "truck_types")
@NoArgsConstructor
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

}
