package org.virtualcave.exercice.tarifas.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.virtualcave.exercice.tarifas.model.Rate;

public interface RatesRepository extends JpaRepository<Rate, Long> {
}
