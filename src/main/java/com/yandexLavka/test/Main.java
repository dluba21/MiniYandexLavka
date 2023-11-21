package com.yandexLavka.test;

import org.mapstruct.factory.Mappers;

public class Main {

    public static void main(String[] args) {
        TestMapper mapper = Mappers.getMapper(TestMapper.class);
        TestMapper2 mapper2 = Mappers.getMapper(TestMapper2.class);

        FooDTO fooDTO = new FooDTO(27, 10000124L, "Privet");
        BarDTO barDTO = mapper.fooToBar(fooDTO);

        System.out.println(fooDTO);

    }
}
