package com.gabriel.timezonefetcher.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gabriel.timezonefetcher.dtos.TimeZoneDtoRequest;
import com.gabriel.timezonefetcher.dtos.TimeZoneDtoResponse;
import com.gabriel.timezonefetcher.services.TimeZoneService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequestMapping("/timezone")
public class TimeZoneController {

    @Autowired
    private TimeZoneService timeZoneService;

    @GetMapping()
    public ResponseEntity<TimeZoneDtoResponse> getTimeZone(@RequestBody TimeZoneDtoRequest request) {
        return new ResponseEntity<TimeZoneDtoResponse>(this.timeZoneService.getZonedDateTime(request), HttpStatus.OK);
    }
    
    
}
