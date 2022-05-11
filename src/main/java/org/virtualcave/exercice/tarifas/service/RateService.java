package org.virtualcave.exercice.tarifas.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.virtualcave.exercice.tarifas.dto.RatesDto;
import org.virtualcave.exercice.tarifas.model.Rate;
import org.virtualcave.exercice.tarifas.repository.RatesRepository;

@Service
public class RateService {
    @Autowired
    private RatesRepository ratesRepository;

    @Autowired
    private ModelMapper modelMapper;

    public Rate createRate(RatesDto ratesDto) {
        Rate rate = Rate.builder().brandId(ratesDto.getBrandId())
                .endDate(ratesDto.getEndDate())
                .startDate(ratesDto.getStartDate())
                .price(ratesDto.getPrice())
                .productId(ratesDto.getProductId()).build();
        return ratesRepository.save(rate);
    }

    public RatesDto findById(Long id) {
        Rate rate = ratesRepository.getById(id);
        return modelMapper.map(rate, RatesDto.class);
    }

    public void deleteById(Long id) {
        ratesRepository.deleteById(id);
    }

    public RatesDto modifyPrice(Long price, Long id) {
        Rate rate = ratesRepository.getById(id);
        rate.setPrice(price);
        ratesRepository.save(rate);
        return modelMapper.map(rate, RatesDto.class);
    }
}
