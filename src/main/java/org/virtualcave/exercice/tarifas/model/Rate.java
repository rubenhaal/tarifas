package org.virtualcave.exercice.tarifas.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
public class Rate {
    @Id
    private Long id;
    private Long brandId;
    private Long productId;
    private LocalDate startDate;
    private LocalDate endDate;
    private Long price;

}
