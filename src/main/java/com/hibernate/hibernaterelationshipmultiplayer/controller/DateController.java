package com.hibernate.hibernaterelationshipmultiplayer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@RestController
@RequestMapping("/api")
public class DateController {

//    localhost:8080/api/date/?d=18.10.10//

    @PostMapping("/date")
    public Date date(@RequestParam("d")@DateTimeFormat(pattern = "dd.MM.yy") Date date) {
        return date;
    }

    @PostMapping("/localDate/{localDate}")
    public void localDate(@RequestParam("localDate")@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate localDate) {
        // ...
    }

    @PostMapping("/localDateTime/{localDateTime}")
    public void dateTime(@RequestParam("localDateTime")@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime localDateTime) {
        // ...
    }
}
