package com.med.backend;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/patients")
@CrossOrigin(origins="*")
public class PatientController {
    @Autowired
    private FhirService fhirService;

    @PostMapping
    public String receivePatientData(@RequestBody String patientJson) throws Exception{
        System.out.println("=== PATIENTENDATEN IM BACKEND EMPFANGEN ===");
        System.out.println(patientJson);
        String json = fhirService.jsonFHIR(patientJson);
        System.out.println(json);
        System.out.println("==========================================");
        return "Patientendaten erfolgreich empfangen!";

    }
}
