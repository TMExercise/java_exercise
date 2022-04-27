package com.interview.exercise.entities.courier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/courier")
public class CourierController {
    @Autowired
    CourierService service;

    @GetMapping("/all")
    public ArrayList<CourierDto> getAllCouriers() {
        return service.getAllCouriers();
    }

    @GetMapping("/all/{name}")
    public ArrayList<CourierDto> getAllCouriersByName(@RequestParam("name") String name) {
        return service.getAllCouriersByName(name);
    }

    @PostMapping("")
    public CourierDto createCourier(CourierDto courier) {
        return service.createCourier(courier);
    }
}
