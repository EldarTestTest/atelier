package com.dreamteam.atelier.model.local;

public class RegistrationUser {

    private String email;
    private String mobile;
    private Boolean registr;

    public RegistrationUser() {
        registr = false;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Boolean getRegistr() {
        return registr;
    }

    public void setRegistr(Boolean registr) {
        this.registr = registr;
    }
}
