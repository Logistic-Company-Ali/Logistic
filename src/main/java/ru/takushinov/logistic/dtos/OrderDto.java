package ru.takushinov.logistic.dtos;

public class OrderDto {
    private Long id;
    private ClientDto client;
    private TruckDto truck;
    private String cargo;
    private Integer cargoWeight;
    private Integer cargoVolume;
    private Integer addressLoading;
    private String addressUnloading;
    private String note;
    private String status;
    private Integer distance;
    private Integer totalTime;
    private Integer tariffType;
}
