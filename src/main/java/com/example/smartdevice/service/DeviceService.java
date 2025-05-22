/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.smartdevice.service;

/**
 *
 * @author ajand
 */

import com.example.smartdevice.model.Device;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class DeviceService {
    private final Map<String, Device> devices = new HashMap<>();

    public DeviceService() {
        // Initialize with sample devices
        devices.put("101", new Device("101"));
        devices.put("102", new Device("102"));
    }

    public Collection<Device> getAllDevices() {
        return devices.values();
    }

    public Device getDevice(String id) {
        return devices.get(id);
    }

    public String turnOn(String id) {
        Device device = devices.get(id);
        if (device != null) {
            device.setStatus("ON");
            return "Device " + id + " is now ON";
        }
        return "Device not found.";
    }

    public String turnOff(String id) {
        Device device = devices.get(id);
        if (device != null) {
            device.setStatus("OFF");
            return "Device " + id + " is now OFF";
        }
        return "Device not found.";
    }

    public String updateSettings(String id, Map<String, String> newSettings) {
        Device device = devices.get(id);
        if (device != null) {
            device.updateSettings(newSettings);
            return "Settings updated for device " + id;
        }
        return "Device not found.";
    }
}
