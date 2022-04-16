package com.desingpattern.creational.objectpool;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


@RestController
class HealthcheckController {

    @GetMapping(value = "/healthcheck")
    public ResponseEntity<String> healthcheck(@RequestParam String format) {

        if (format == null) {
            return ResponseEntity
                    .badRequest()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(null);

        }
        String response;
        if ("full".equals(format)) {

            ResponsHolder responsHolder = new ResponsHolder(ZonedDateTime.now(ZoneId.of("Europe/Paris"))
                    .truncatedTo(ChronoUnit.MINUTES)
                    .format(DateTimeFormatter.ISO_DATE_TIME), "\"status\": \"OK\" ");

            response = responsHolder.toString();
            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(response);

        } else if ("short".equals(format)) {
            response = "{ \"status\": \"OK\" } ";
            return ResponseEntity
                    .ok()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(response);
        } else {
            return ResponseEntity
                    .badRequest()
                    .contentType(MediaType.APPLICATION_JSON)
                    .body(null);
        }


    }

    @PutMapping(value = "/healthcheck")
    public ResponseEntity<Object> healthcheckPut() {
        return new ResponseEntity<>(HttpStatus.METHOD_NOT_ALLOWED);
    }

    @PostMapping(value = "/healthcheck")
    public ResponseEntity<Object> healthcheckPost() {
        return new ResponseEntity<>(HttpStatus.METHOD_NOT_ALLOWED);
    }


    @DeleteMapping(value = "/healthcheck")
    public ResponseEntity<Object> healthcheckDelete() {
        return new ResponseEntity<>(HttpStatus.METHOD_NOT_ALLOWED);
    }


    public class ResponsHolder {
        public String getCurrentTime() {
            return currentTime;
        }

        public String getStatus() {
            return status;
        }

        @Override
        public String toString() {
            return "{" +
                    "currentTime='" + currentTime + '\'' +
                    ", status='" + status + '\'' +
                    '}';
        }

        private String currentTime;
        private String status;

        public ResponsHolder(String currentTime, String status) {
            this.currentTime = currentTime;
            this.status = status;
        }


    }

}

