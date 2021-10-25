package com.yazykov.starter.services;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TimeServiceIml implements TimeService {

    @Override
    public LocalDateTime getCurrentDateTime() {
        return LocalDateTime.now();
    }
}
