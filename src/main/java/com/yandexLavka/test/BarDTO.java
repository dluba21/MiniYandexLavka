package com.yandexLavka.test;

import com.yandexLavka.enums.District;

public class BarDTO {
    private String a;
    private long b;

    private District c;

    public BarDTO(String a, long b, District c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public long getB() {
        return b;
    }

    public void setB(long b) {
        this.b = b;
    }

    public District getC() {
        return c;
    }

    public void setC(District c) {
        this.c = c;
    }
}
