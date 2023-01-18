package com.hibernate.hibernaterelationshipmultiplayer.entity;


import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Message {

  private String text;

  @JsonFormat(pattern = "dd/MM/yyyy")
  private LocalDate date;

  @JsonFormat(pattern = "hh:mm:ss a")
  private LocalTime time;

  @JsonFormat(pattern = "dd/MM/yyyy hh:mm:ss a")
  private LocalDateTime timestamp;
  //Getter and Setter
}