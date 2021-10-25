package com.yazykov.test.starter.controllers;




import com.yazykov.starter.services.TimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/times")
public class DateTimeController {

    @Autowired
    public TimeService currentTimes;

    @GetMapping("/current")
    public LocalDateTime getCurrentDateTimes() {
        return currentTimes.getCurrentDateTime();
    }

}
