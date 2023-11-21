package com.yandexLavka.test;

import org.mapstruct.Mapper;

@Mapper
public interface TestMapper {
    BarDTO fooToBar(final FooDTO fooDTO);
}
