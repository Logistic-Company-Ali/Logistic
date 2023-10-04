package ru.takushinov.logistic.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class AppError {
    private String code;
    private String message;

}
