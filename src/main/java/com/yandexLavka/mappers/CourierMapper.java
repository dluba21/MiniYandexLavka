package com.yandexLavka.mappers;

import com.yandexLavka.dtos.CourierDTO;
import com.yandexLavka.entity.Courier;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CourierMapper {
    CourierDTO entityToDto(final Courier courier);

    Courier dtoToEntity(final CourierDTO courier);
}
