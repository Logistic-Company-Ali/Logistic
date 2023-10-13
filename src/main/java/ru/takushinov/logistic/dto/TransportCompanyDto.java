package ru.takushinov.logistic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TransportCompanyDto {
    private Long id;
    private String shortName;
    private String fullName;
    private String email;
    private String phone;
    private String inn;
    private String kpp;
    private String fioRuk;
    private String address;
}
