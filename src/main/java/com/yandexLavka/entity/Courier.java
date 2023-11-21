package com.yandexLavka.entity;

import com.yandexLavka.enums.District;
import com.yandexLavka.enums.MovementType;
import jakarta.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "COURIERS")
public class Courier {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "DISTRICT")
    @Enumerated(EnumType.STRING)
    private District district;
    @Column(name = "MOVEMENT_TYPE")
    @Enumerated(EnumType.STRING)
    private MovementType movementType;
    @Column(name = "START_WORK_TIME")
    private LocalTime startWorkTime;
    @Column(name = "END_WORK_TIME")
    private LocalTime endWorkTime;

    public Courier() {
    }

    public Courier(Long id, District district, MovementType movementType, LocalTime startWorkTime, LocalTime endWorkTime) {
        this.id = id;
        this.district = district;
        this.movementType = movementType;
        this.startWorkTime = startWorkTime;
        this.endWorkTime = endWorkTime;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    public MovementType getMovementType() {
        return movementType;
    }

    public void setMovementType(MovementType movementType) {
        this.movementType = movementType;
    }

    public LocalTime getStartWorkTime() {
        return startWorkTime;
    }

    public void setStartWorkTime(LocalTime startWorkTime) {
        this.startWorkTime = startWorkTime;
    }

    public LocalTime getEndWorkTime() {
        return endWorkTime;
    }

    public void setEndWorkTime(LocalTime endWorkTime) {
        this.endWorkTime = endWorkTime;
    }
}