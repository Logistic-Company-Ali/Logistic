package ru.takushinov.logistic.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class TruckTypeDto {
    private Long id;
    private String type;
    private Integer tariffByKm;
    private Integer tariffByHour;
}
