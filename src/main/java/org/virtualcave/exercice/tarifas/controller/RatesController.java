package org.virtualcave.exercice.tarifas.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.virtualcave.exercice.tarifas.dto.RatesDto;
import org.virtualcave.exercice.tarifas.service.RateService;


// me queda postgre
// me queda wiremock
// me queda formateo
// me queda un test
// me queda control de excepciones
// HATEOAS?

// versiones?
@RestController
@RequestMapping("rates/api")
public class RatesController {

    @Autowired
    private RateService rateService;

    @GetMapping(path = "v1/test")
    public String test() {
        return "test";
    }

    @PostMapping("/rates")
    public ResponseEntity createRate(@RequestBody RatesDto ratesDto) {

        rateService.createRate(ratesDto);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public RatesDto getRateById(@PathVariable Long id) {

        return rateService.findById(id);
    }

    @PutMapping("/{id}")
    public RatesDto modifyPrice(@RequestBody RatesDto ratesDto, @PathVariable Long id) {
        return rateService.modifyPrice(ratesDto.getPrice(), id);
    }

    @DeleteMapping("/{id}")
    public void deleteRate(@PathVariable Long id) {
        rateService.deleteById(id);
    }

    public String filterRates() {
        return "filterRates";
    }

}
