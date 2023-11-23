package com.yandexLavka.dtos;

import com.yandexLavka.enums.District;
import com.yandexLavka.enums.MovementType;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;

@Schema(name = "Информация о курьере")
public class CourierDTO {

    /**
     * Id курьера
     */
    @Min(0)
    @Schema(description = "Id курьера", example = "1", implementation = Long.class)
    private Long id;

    /**
     * Район обслуживания
     */
    @Schema(description = "Район обслуживания", example = "TAGANSKIY", implementation = District.class)
    private District district; //в будущем  EnumSet<District> и ManyToMany

    /**
     * Тип перемещения курьера
     */
    @Schema(description = "Тип перемещения курьера", example = "CAR", implementation = MovementType.class)
    private MovementType movementType;

    /**
     * Часы работы курьера в формате HH:MM-HH:MM
     */
    @Pattern(
            regexp = "^(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]-(0[0-9]|1[0-9]|2[0-3]):[0-5][0-9]$",
            message = "Часы работы не соответствуют формату HH:MM-HH:MM"
    )
    @Schema(description = "Часы работы курьера в формате HH:MM-HH:MM", example = "09:00-18:00", implementation = String.class)
    private String workHours;

    public CourierDTO() {
    }

    public CourierDTO(Long id, District district, MovementType movementType, String workHours) {
        this.id = id;
        this.district = district;
        this.movementType = movementType;
        this.workHours = workHours;
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

    public String getWorkHours() {
        return workHours;
    }

    public void setWorkHours(String workHours) {
        this.workHours = workHours;
    }
}
