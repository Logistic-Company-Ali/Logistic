package ru.takushinov.logistic.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "transport_company")
@NoArgsConstructor
@Data
public class TransportCompany {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "short_name")
    private String shortName;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "inn")
    private String inn;
    @Column(name = "kpp")
    private String kpp;
    @Column(name = "fio_ruk")
    private String fioRuk;
    @Column(name = "address")
    private String address;
    @OneToMany(mappedBy = "transportCompany")
    private List<Truck> trucks;
}
