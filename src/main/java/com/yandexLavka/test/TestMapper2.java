package com.yandexLavka.test;

import com.yandexLavka.dtos.CourierDTO;
import com.yandexLavka.entity.Courier;
import org.mapstruct.Mapper;

@Mapper
public interface TestMapper2 {
    CourierDTO courierToDto(Courier courier);
}
