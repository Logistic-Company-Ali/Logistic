package ru.takushinov.logistic.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders")
@NoArgsConstructor
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "client_id")
    private Long clientId;
    @Column(name = "truck_id")
    private Long truckId;
    @Column(name = "cargo")
    private String cargo;
    @Column(name = "cargo_weight")
    private Integer cargoWeight;
    @Column(name = "cargo_volume")
    private Integer cargoVolume;
    @Column(name = "address_loading")
    private Integer addressLoading;
    @Column(name = "address_unloading")
    private String addressUnloading;
    @Column(name = "note")
    private String note;
    @Column(name = "status")
    private String status;
    @Column(name = "distance")
    private Integer distance;
    @Column(name = "total_time")
    private Integer totalTime;
    @Column(name = "tariff_type")
    private Integer tariffType;
}
