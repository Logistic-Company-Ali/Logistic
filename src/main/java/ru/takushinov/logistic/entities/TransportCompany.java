package ru.takushinov.logistic.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

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
    private Long shortName;
    @Column(name = "full_name")
    private Long fullName;
    @Column(name = "email")
    private Long email;
    @Column(name = "phone")
    private Long phone;
    @Column(name = "inn")
    private Long inn;
    @Column(name = "kpp")
    private Long kpp;
    @Column(name = "fio_ruk")
    private Long fioRuk;
    @Column(name = "adress")
    private Long adress;
}
