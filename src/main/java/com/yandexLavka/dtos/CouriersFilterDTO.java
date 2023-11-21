package com.yandexLavka.dtos;

import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Nullable;

import javax.validation.constraints.Min;


@Schema(name = "Фильтр для оконного вывода списка курьеров")
public class CouriersFilterDTO {

    /**
     * Оффсет оконного фильтра
     */
    @Nullable
    @Min(0)
    @JsonSetter(nulls = Nulls.SKIP)
    @Schema(name = "offset", description = "Оффсет оконного фильтра", example = "1")
    private Long offset = 0L;

    /**
     * Лимит оконного фильтра
     */
    @Nullable
    @Min(0)
    @JsonSetter(nulls = Nulls.SKIP)
    @Schema(name = "limit", description = "Лимит оконного фильтра", example = "1")
    private Long limit = 1L;

    public CouriersFilterDTO() {
    }

    public Long getOffset() {
        return offset;
    }

    public Long getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }
}
