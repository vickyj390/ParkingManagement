package com.example.parking.bean;

import org.litepal.annotation.Column;
import org.litepal.crud.LitePalSupport;

public class User extends LitePalSupport {
    @Column(nullable = false)
    private String number;

    private String username;

    @Column(nullable = false)
    private Boolean isMonthRent;

    private Long monthRentStartTime;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getIsMonthRent() {
        return isMonthRent;
    }

    public void setIsMonthRent(Boolean isMonthRent) {
        this.isMonthRent = isMonthRent;
    }

    public Long getMonthRentStartTime() {
        return monthRentStartTime;
    }

    public void setMonthRentStartTime(Long monthRentStartTime) {
        this.monthRentStartTime = monthRentStartTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "number='" + number + '\'' +
                ", username='" + username + '\'' +
                ", isMonthRent=" + isMonthRent +
                ", monthRentStartTime=" + monthRentStartTime +
                '}';
    }
}
