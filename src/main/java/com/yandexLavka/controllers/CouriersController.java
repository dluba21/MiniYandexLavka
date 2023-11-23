package com.yandexLavka.controllers;

import com.yandexLavka.dtos.CourierDTO;
import com.yandexLavka.dtos.CouriersFilterDTO;
import com.yandexLavka.services.CourierHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import jakarta.validation.constraints.Positive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/couriers")
public class CouriersController {
    @Autowired
    private CourierHandler courierHandler;

    @Operation(description = "Добавляет список курьеров в систему",
            responses = {
                    @ApiResponse(responseCode = "200", description = "OK", content = {
                            @Content(mediaType = "application/json")
                    }),
                    @ApiResponse(responseCode = "400", description = "Not Found"),
                    @ApiResponse(responseCode = "500", description = "Server error")
            }
    )
    @PostMapping("")
    public void addCouriers(@RequestBody @Valid final List<CourierDTO> courierDTOs) {
        courierHandler.addCouriers(courierDTOs);
    }

    @Operation(description = "Возвращает список курьеров по фильтру",
            responses = {
                    @ApiResponse(responseCode = "200", description = "OK", content = {
                           @Content(mediaType = "application/json")
                    }),
                    @ApiResponse(responseCode = "400", description = "Not Found"),
                    @ApiResponse(responseCode = "500", description = "Server error")
    }
    )
    @GetMapping("")
    public List<CourierDTO> getCouriersInfo(@Valid final CouriersFilterDTO filter) {
        return courierHandler.getCouriersInfo(filter);
    }

    @Operation(description = "Возвращает информацию о курьере по идентификатору",
          responses = {
                    @ApiResponse(responseCode = "200", description = "OK", content = {
                            @Content(mediaType = "application/json")
                    }),
                    @ApiResponse(responseCode = "400", description = "Not Found"),
                    @ApiResponse(responseCode = "500", description = "Server error")
            }
    )
    @GetMapping("/{courierId}")
    public CourierDTO getCourierInfo(
            @Schema(name = "courierId",
                    description = "Идентификатор курьера", type = "string", example = "1")
            @Positive @PathVariable final Long courierId) {
        return courierHandler.getCourierInfo(courierId);
    }
}
