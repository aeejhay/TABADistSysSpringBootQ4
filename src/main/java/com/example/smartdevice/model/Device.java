/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.smartdevice.model;

/**
 *
 * @author ajand
 */

import java.util.HashMap;
import java.util.Map;

public class Device {
    private String id;
    private String status;
    private Map<String, String> settings = new HashMap<>();

    public Device(String id) {
        this.id = id;
        this.status = "OFF";
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Map<String, String> getSettings() {
        return settings;
    }

    public void updateSettings(Map<String, String> newSettings) {
        this.settings.putAll(newSettings);
    }
}

