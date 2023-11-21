package com.yandexLavka.services;

import com.yandexLavka.dtos.CourierDTO;
import com.yandexLavka.dtos.CouriersFilterDTO;
import com.yandexLavka.mappers.CourierMapper;
import com.yandexLavka.repository.CourierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourierHandlerImpl implements CourierHandler {

    private final CourierMapper courierMapper;
    private final CourierRepository courierRepository;

    @Autowired
    public CourierHandlerImpl(CourierRepository courierRepository,
                              CourierMapper courierMapper
    ) {
        this.courierMapper = courierMapper;
        this.courierRepository = courierRepository;
    }

    public List<CourierDTO> getCouriers(final CouriersFilterDTO filter) {


        courierRepository.findAll();
        return courierRepository.findAllWithLimitAndOffset(
                    filter.getLimit(),
                    filter.getOffset())
                .stream()
                .map(courierMapper::entityToDto)
                .collect(Collectors.toList());
    }


}
