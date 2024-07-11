package com.gabriel.timezonefetcher.services;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabriel.timezonefetcher.dtos.TimeZoneDtoRequest;
import com.gabriel.timezonefetcher.dtos.TimeZoneDtoResponse;

@Service
public class TimeZoneService {

    @Autowired
    private CountryZoneIdService countryZoneIdService;
    
    public TimeZoneDtoResponse getZonedDateTime(TimeZoneDtoRequest request) {
        LocalDateTime currenDateTime = LocalDateTime.now();
        ZoneId systemZone = ZoneId.systemDefault();
        ZonedDateTime currentDateTimeInSystemZone = ZonedDateTime.of(currenDateTime, systemZone);
        
        String zoneId = this.countryZoneIdService.getZoneIdByCountry(request.country());

        ZoneId searchZone = ZoneId.of(zoneId);
        
        ZonedDateTime currentTimeInSearchedZone = currentDateTimeInSystemZone.withZoneSameInstant(searchZone);

        TimeZoneDtoResponse timeZoneResponse = new TimeZoneDtoResponse(
            currentTimeInSearchedZone.getYear(), 
            currentTimeInSearchedZone.getMonth(), 
            currentTimeInSearchedZone.getDayOfMonth(), 
            currentTimeInSearchedZone.getHour(), 
            currentTimeInSearchedZone.getMinute(), 
            currentTimeInSearchedZone.getSecond(),
            currentTimeInSearchedZone.getZone(),
            currentTimeInSearchedZone.getOffset()
        );

        return timeZoneResponse;
    }

}
