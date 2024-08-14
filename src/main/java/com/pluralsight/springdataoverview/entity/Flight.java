package com.pluralsight.springdataoverview.entity;

import java.time.LocalDateTime;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Entity //to make it recognized as a table in the DB
@Data
public class Flight {
    @Id
    @GeneratedValue
    private Long id;
    private String origin;
    private String destination;
    private LocalDateTime scheduledAt;

//    @Override
//    public String toString() {
//        return "Flight{" +
//            "id=" + id +
//            ", origin='" + origin + '\'' +
//            ", destination='" + destination + '\'' +
//            ", scheduledAt=" + scheduledAt +
//            '}';
//    }
}
