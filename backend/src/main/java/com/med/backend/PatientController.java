package com.med.backend;


import org.springframework.web.bind.annotation.*;

public class PatientController {
    @PostMapping
    public String receivePatientData(@RequestBody String patientJson) {
        System.out.println("=== PATIENTENDATEN IM BACKEND EMPFANGEN ===");
        System.out.println(patientJson);
        System.out.println("==========================================");

        return "Patientendaten erfolgreich empfangen!";
    }
}
