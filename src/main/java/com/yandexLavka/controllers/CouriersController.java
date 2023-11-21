package com.yandexLavka.controllers;

import com.yandexLavka.dtos.CourierDTO;
import com.yandexLavka.dtos.CouriersFilterDTO;
import com.yandexLavka.services.CourierHandler;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/couriers")
public class CouriersController {
    @Autowired
    private CourierHandler courierHandler;

    @Operation(description = "Возвращает список курьеров по фильтру",
//            requestBody = @io.swagger.v3.oas.annotations.parameters.RequestBody(
//                    content = {
//                            @Content(
//                                    schema = @Schema(implementation = CouriersFilterDTO.class)
//                            )
//                }
//            ),
            responses = {
                    @ApiResponse(responseCode = "200", description = "OK", content = {
                           @Content(mediaType = "application/json")
                    }),
                    @ApiResponse(responseCode = "400", description = "Not Found"),
                    @ApiResponse(responseCode = "500", description = "Server error")
    }
    )
    @GetMapping("/show")
    public List<CourierDTO> getCouriers(@Valid final CouriersFilterDTO filter) {
        return courierHandler.getCouriers(filter);
    }
}
