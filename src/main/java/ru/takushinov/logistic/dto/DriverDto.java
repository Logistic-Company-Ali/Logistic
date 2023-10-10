package ru.takushinov.logistic.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DriverDto {
    private Long id;
    private String lastname;
    private String name;
    private String patronymic;
    private TruckDto truck;

}
