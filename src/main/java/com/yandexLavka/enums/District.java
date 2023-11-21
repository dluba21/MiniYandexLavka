package com.yandexLavka.enums;

public enum District {
    ARBAT(1, "Арбат"),
    BASSMANNIY(2, "Басманный"),
    ZAMOSKVORECHYE(3, "Замоскворечье"),
    KRASNOSELSKIY(4, "Красносельский"),
    TAGANSKIY(5, "Таганский"),
    PRESNENSKIY(6, "Пресненский"),
    TVERSKOY(7, "Тверской"),
    YAKIMANKA(8, "Якиманка");

    private int id;
    private String description;

    District(int id, String description) {
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

