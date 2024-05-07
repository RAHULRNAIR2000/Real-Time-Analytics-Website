package com.dashboard.dashboard.dto;

public class DataCounts {
    private Long currentDateCount;
    private Long dayOfWeekCount;
    private Long hourOfDayCount;
    private Long uniqueValueCount;

    public DataCounts(Long currentDateCount, Long dayOfWeekCount, Long hourOfDayCount) {
        this.currentDateCount = currentDateCount;
        this.dayOfWeekCount = dayOfWeekCount;
        this.hourOfDayCount = hourOfDayCount;
//        this.uniqueValueCount = uniqueValueCount;
    }

    public Long getCurrentDateCount() {
        return currentDateCount;
    }

    public void setCurrentDateCount(Long currentDateCount) {
        this.currentDateCount = currentDateCount;
    }

    public Long getDayOfWeekCount() {
        return dayOfWeekCount;
    }

    public void setDayOfWeekCount(Long dayOfWeekCount) {
        this.dayOfWeekCount = dayOfWeekCount;
    }

    public Long getHourOfDayCount() {
        return hourOfDayCount;
    }

    public void setHourOfDayCount(Long hourOfDayCount) {
        this.hourOfDayCount = hourOfDayCount;
    }

    public Long getUniqueValueCount() {
        return uniqueValueCount;
    }

    public void setUniqueValueCount(Long uniqueValueCount) {
        this.uniqueValueCount = uniqueValueCount;
    }
}
