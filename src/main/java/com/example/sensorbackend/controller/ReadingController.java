package com.example.sensorbackend.controller;

import com.example.sensorbackend.model.Reading;
import com.example.sensorbackend.repository.ReadingRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/readings")
@CrossOrigin(origins = "*")
public class ReadingController {
    private final ReadingRepository repository;

    public ReadingController(ReadingRepository repository) {
        this.repository = repository;
    }

    @PostMapping
    public Reading createReading(@RequestBody Reading reading) {
        return repository.save(reading);
    }

    @GetMapping
    public List<Reading> getAllReadings() {
        return repository.findAll();
    }

    @GetMapping("/{sensorId}")
    public List<Reading> getReadingsBySensor(@PathVariable String sensorId) {
        return repository.findBySensorId(sensorId);
    }
}
