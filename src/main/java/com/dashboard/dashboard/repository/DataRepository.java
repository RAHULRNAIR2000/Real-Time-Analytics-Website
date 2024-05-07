package com.dashboard.dashboard.repository;

import com.dashboard.dashboard.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface DataRepository extends JpaRepository<Data, Long> {
    Long countByCurrentDay(LocalDate currentDay);

    Long countByDayOfWeek(String dayOfWeek);

    Long countByHourOfDay(int hourOfDay);

    Long countByUniqueValue(String uniqueValue);

//    Long countDistinctByUniqueValue(); // for counting distinct unique values
}
