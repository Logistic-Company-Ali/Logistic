package ru.takushinov.logistic.dtos;

import java.util.List;


public class ClientDto {
    private Long id;
    private String shortName;
    private String fullName;
    private String email;
    private String phone;
    private String inn;
    private String kpp;
    private String fioRuk;
    private String address;
    private List<OrderDto> orders;
}
