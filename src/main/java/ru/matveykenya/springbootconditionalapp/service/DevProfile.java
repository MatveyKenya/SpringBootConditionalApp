package ru.matveykenya.springbootconditionalapp.service;

public class DevProfile implements SystemProfile {
    @Override
    public String getProfile() {
        return "Current service is dev";
    }
}
