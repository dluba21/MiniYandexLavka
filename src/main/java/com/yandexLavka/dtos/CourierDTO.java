package com.yandexLavka.dtos;

import com.yandexLavka.enums.District;
import com.yandexLavka.enums.MovementType;
import io.swagger.v3.oas.annotations.media.Schema;

import java.time.LocalTime;

@Schema(name = "Информация о курьере")
public class CourierDTO {

    /**
     * Id курьера
     */
    @Schema(description = "Id курьера", example = "1", implementation = Long.class)
    private Long id;

    /**
     * Район обслуживания
     */
    @Schema(description = "Район обслуживания", example = "Taganskiy", implementation = District.class)
    private District district; //в будущем  EnumSet<District> и ManyToMany

    /**
     * Тип перемещения курьера
     */
    @Schema(description = "Тип перемещения курьера", example = "Car", implementation = MovementType.class)
    private MovementType movementType;

    /**
     * Время начала работы
     */
    @Schema(description = "Время начала работы", example = "11:00:00")
    private LocalTime startWorkTime;

    /**
     * Время конца работы
     */
    @Schema(description = "Время конца работы", example = "11:00:00")
    private LocalTime endWorkTime;

    public CourierDTO() {
    }

    public CourierDTO(Long id, District district, MovementType movementType, LocalTime startWorkTime, LocalTime endWorkTime) {
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
