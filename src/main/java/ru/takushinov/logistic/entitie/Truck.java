package ru.takushinov.logistic.entitie;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "trucks")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Truck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "model")
    private String model;
    @Column(name = "number")
    private String number;
    @Column(name = "load_capacity")
    private Integer loadCapacity;
    @Column(name = "length")
    private Integer length;
    @Column(name = "height")
    private Integer height;
    @Column(name = "width")
    private Integer width;
    @ManyToOne
    @JoinColumn(name = "transport_company_id")
    private TransportCompany transportCompany;
    @ManyToOne
    @JoinColumn(name = "truck_types_id")
    private TruckType truckType;
    @OneToMany(mappedBy = "truck")
    private List<Order> orders;
    @OneToOne(mappedBy = "truck")
    private Driver driver;

}
