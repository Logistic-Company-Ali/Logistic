package ru.takushinov.logistic.dto;


import java.util.List;

public class TruckTypeDto {
    private Long id;
    private String type;
    private Integer tariffByKm;
    private Integer tariffByHour;
    private List<TruckDto> trucks;

}
