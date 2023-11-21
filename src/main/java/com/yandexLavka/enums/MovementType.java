package com.yandexLavka.enums;

public enum MovementType {
    FOOT(1, "Пеший курьер"),
    BIKE(2, "Велокурьер"),
    CAR(3, "Курьер на автомобиле");

    private int id;
    private String description;

    MovementType(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
