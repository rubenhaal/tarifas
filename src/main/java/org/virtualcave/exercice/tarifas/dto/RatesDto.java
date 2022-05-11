package org.virtualcave.exercice.tarifas.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class RatesDto {
    private Long brandId;
    private Long productId;
    private LocalDate startDate;
    private LocalDate endDate;
    private Long price;
}
