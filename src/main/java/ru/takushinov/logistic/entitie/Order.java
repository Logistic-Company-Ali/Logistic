package ru.takushinov.logistic.entitie;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
    @ManyToOne
    @JoinColumn(name = "truck_id")
    private Truck truck;
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
