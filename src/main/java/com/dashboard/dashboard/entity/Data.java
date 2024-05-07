package com.dashboard.dashboard.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate currentDay;
    private String dayOfWeek;
    private int hourOfDay;
    private String uniqueValue;




    public Long getId() {
        return id;
    }

    public LocalDate getCurrentDay() {
        return currentDay;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public int getHourOfDay() {
        return hourOfDay;
    }

    public String getUniqueValue() {
        return uniqueValue;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCurrentDay(LocalDate currentDay) {
        this.currentDay = currentDay;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void setHourOfDay(int hourOfDay) {
        this.hourOfDay = hourOfDay;
    }

    public void setUniqueValue(String uniqueValue) {
        this.uniqueValue = uniqueValue;
    }

    public Data() {
        this.id = id;
        this.currentDay = currentDay;
        this.dayOfWeek = dayOfWeek;
        this.hourOfDay = hourOfDay;
        this.uniqueValue = uniqueValue;
    }
}
