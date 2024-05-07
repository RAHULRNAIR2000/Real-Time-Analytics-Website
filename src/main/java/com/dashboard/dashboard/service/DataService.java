package com.dashboard.dashboard.service;


import com.dashboard.dashboard.entity.Data;
import com.dashboard.dashboard.repository.DataRepository;
import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Random;

@Service
public class DataService {
    @Autowired
    private DataRepository dataRepository;


    @PostConstruct
    public void initialize() {


        insertData();

    }
    @Scheduled(fixedDelay = 1000)
    @Transactional
    public void insertData() {
        // Generate data
        Data data = new Data();
        data.setCurrentDay(LocalDate.now());
        data.setDayOfWeek(getActualDayOfWeek());
        data.setHourOfDay(LocalDateTime.now().getHour());
        data.setUniqueValue(generateUniqueValue());

        System.out.println("Data to be inserted: " + data);

        System.out.println("insertion completed");
        // Save data to the database
        dataRepository.save(data);
    }

    private String getActualDayOfWeek() {
        // Get the current day of the week
        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        return dayOfWeek.toString(); // Return the day of the week as a string
    }

    private String generateUniqueValue() {
        // Generate a random 6-digit value
        Random random = new Random();
        int number = random.nextInt(900000) + 100000;
        return String.valueOf(number);
    }

    public Long getCountByCurrentDay(LocalDate currentDay) {
        return dataRepository.countByCurrentDay(currentDay);
    }

    public Long getCountByDayOfWeek(String dayOfWeek) {
        return dataRepository.countByDayOfWeek(dayOfWeek);
    }

    public Long getCountByHourOfDay(int hourOfDay) {
        return dataRepository.countByHourOfDay(hourOfDay);
    }

//    public Long getCountDistinctUniqueValue() {
//        return dataRepository.countDistinctByUniqueValue();
//    }
    public Long getcountByUniqueValue(){
        return dataRepository.countByUniqueValue("");
    }


}
