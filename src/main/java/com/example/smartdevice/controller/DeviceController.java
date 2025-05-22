/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.smartdevice.controller;

/**
 *
 * @author ajand
 */

import com.example.smartdevice.model.Device;
import com.example.smartdevice.service.DeviceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Map;

@RestController
@RequestMapping("/devices")
public class DeviceController {

    private final DeviceService service;

    public DeviceController(DeviceService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Collection<Device>> listDevices() {
        return ResponseEntity.ok(service.getAllDevices());
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getDeviceStatus(@PathVariable String id) {
        Device device = service.getDevice(id);
        if (device != null) {
            return ResponseEntity.ok("Device " + id + " status: " + device.getStatus());
        }
        return ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}/on")
    public ResponseEntity<String> turnOnDevice(@PathVariable String id) {
        return ResponseEntity.ok(service.turnOn(id));
    }

    @PutMapping("/{id}/off")
    public ResponseEntity<String> turnOffDevice(@PathVariable String id) {
        return ResponseEntity.ok(service.turnOff(id));
    }

    @PutMapping("/{id}/settings")
    public ResponseEntity<String> updateSettings(@PathVariable String id, @RequestBody Map<String, String> settings) {
        return ResponseEntity.ok(service.updateSettings(id, settings));
    }
}

