package ru.takushinov.logistic.dto;

import java.util.List;

public class TruckDto {
    private Long id;
    private String model;
    private String number;
    private Integer loadCapacity;
    private Integer length;
    private Integer height;
    private Integer width;
    private TransportCompanyDto transportCompany;
    private TruckTypeDto truckType;
    private List<OrderDto> orders;
    private DriverDto driver;

}
