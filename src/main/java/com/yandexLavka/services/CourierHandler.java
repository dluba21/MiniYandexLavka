package com.yandexLavka.services;

import com.yandexLavka.dtos.CourierDTO;
import com.yandexLavka.dtos.CouriersFilterDTO;

import java.util.List;

public interface CourierHandler {
    List<CourierDTO> getCouriersInfo(final CouriersFilterDTO filter);
    CourierDTO getCourierInfo(final Long courierId);
    void addCouriers(final List<CourierDTO> courierDTOS);
}
