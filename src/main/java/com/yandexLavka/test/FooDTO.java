package com.yandexLavka.test;

public class FooDTO {
    private int a;
    private Long b;

    private String c;


    public FooDTO(int a, Long b, String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public FooDTO() {
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public Long getB() {
        return b;
    }

    public void setB(Long b) {
        this.b = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
}
