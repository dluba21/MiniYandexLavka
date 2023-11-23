package com.yandexLavka.mappers;

import com.yandexLavka.dtos.CourierDTO;
import com.yandexLavka.entity.Courier;
import com.yandexLavka.utils.CustomTimeUtils;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.time.LocalTime;

@Mapper(componentModel = "spring")
public interface CourierMapper {
    @Mapping(source = ".", target = "workHours", qualifiedByName = "LocalTimeHoursToRaw")
    CourierDTO entityToDto(final Courier courier);

    @Mapping(source = "workHours", target = "startWorkTime", qualifiedByName = "rawToStartHours")
    @Mapping(source = "workHours", target = "endWorkTime", qualifiedByName = "rawToEndHours")
    Courier dtoToEntity(final CourierDTO courier);

    @Named("rawToStartHours")
    static LocalTime rawToStartHours(final String workHours) {
        return CustomTimeUtils.rawToLocalTime(workHours, CustomTimeUtils.START_OF_WORK);
    }

    @Named("rawToEndHours")
    static LocalTime rawToEndHours(final String workHours) {
        return CustomTimeUtils.rawToLocalTime(workHours, CustomTimeUtils.END_OF_WORK);
    }

    @Named("LocalTimeHoursToRaw")
    static String rawToEndHours(final Courier courier) {
        return courier.getStartWorkTime().format(CustomTimeUtils.getFormatter()) +
                "-" + courier.getEndWorkTime().format(CustomTimeUtils.getFormatter());
    }
}
