package ru.takushinov.logistic.dtos;


import java.util.List;

public class TruckTypeDto {
    private Long id;
    private String type;
    private Integer tariffByKm;
    private Integer tariffByHour;
    private List<TruckDto> trucks;

}
