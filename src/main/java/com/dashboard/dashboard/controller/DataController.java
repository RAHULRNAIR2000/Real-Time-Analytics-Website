package com.dashboard.dashboard.controller;

import com.dashboard.dashboard.dto.DataCounts;
import com.dashboard.dashboard.entity.Data;
import com.dashboard.dashboard.repository.DataRepository;
import com.dashboard.dashboard.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@RestController
public class DataController {
    @Autowired
    private DataService dataService;

    @GetMapping("/datacounts")
    public DataCounts getDataCounts() {
        LocalDate currentDate = LocalDate.now();
        int currentHour = LocalDateTime.now().getHour();

        Long currentDateCount = dataService.getCountByCurrentDay(currentDate);
        Long dayOfWeekCount = dataService.getCountByDayOfWeek(currentDate.getDayOfWeek().toString());
        Long hourOfDayCount = dataService.getCountByHourOfDay(currentHour);
//        Long uniqueValueCount = dataService.getCountDistinctUniqueValue();

        return new DataCounts(currentDateCount, dayOfWeekCount, hourOfDayCount);
    }

}
