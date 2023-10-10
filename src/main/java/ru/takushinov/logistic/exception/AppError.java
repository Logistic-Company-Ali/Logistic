package ru.takushinov.logistic.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class AppError {
    private String code;
    private String message;

}
