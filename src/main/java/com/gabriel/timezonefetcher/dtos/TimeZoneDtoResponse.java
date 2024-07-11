package com.gabriel.timezonefetcher.dtos;

import java.time.Month;
import java.time.ZoneId;
import java.time.ZoneOffset;

public record TimeZoneDtoResponse(
    int year, Month month, int day, int hour, int minute, int second, ZoneId zoneId, ZoneOffset offset
) {
    
}
