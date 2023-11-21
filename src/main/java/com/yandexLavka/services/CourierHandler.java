package com.yandexLavka.services;

import com.yandexLavka.dtos.CourierDTO;
import com.yandexLavka.dtos.CouriersFilterDTO;

import java.util.List;

public interface CourierHandler {
    List<CourierDTO> getCouriers(final CouriersFilterDTO filter);
}
