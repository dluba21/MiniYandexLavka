package com.yandexLavka.entity;

import com.yandexLavka.enums.District;
import jakarta.annotation.Nullable;
import jakarta.persistence.*;

import java.time.LocalTime;

@Entity
@Table(name = "ORDERS")
public class Order {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "DISTRICT")
    @Enumerated(EnumType.STRING)
    private District district;
    @Column(name = "START_PICK_TIME")
    private LocalTime startPickTime;
    @Column(name = "END_PICK_TIME")
    private LocalTime endPickTime;
    @Nullable
    @OneToOne(mappedBy = "")
    @Column(name = "COURIER_ID")
    private Courier courier;
}
