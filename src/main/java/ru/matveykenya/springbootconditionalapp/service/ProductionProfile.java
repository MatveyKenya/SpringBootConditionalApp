package ru.matveykenya.springbootconditionalapp.service;

public class ProductionProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current service is production";
    }
}