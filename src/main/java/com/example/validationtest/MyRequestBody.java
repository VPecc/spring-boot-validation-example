package com.example.validationtest;

import javax.validation.constraints.NotNull;

public class MyRequestBody {
    @NotNull
    private String kutya;

    @NotNull
    private String csiga;

    public String getKutya() {
        return kutya;
    }

    public void setKutya(String kutya) {
        this.kutya = kutya;
    }

    public String getCsiga() {
        return csiga;
    }

    public void setCsiga(String csiga) {
        this.csiga = csiga;
    }

}
