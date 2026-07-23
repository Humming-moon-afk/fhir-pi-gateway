package com.med.backend;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/patients")
@CrossOrigin(origins = "*")
public class PatientController {
    @Autowired
    private PatientRepository patientRepository;
    @Autowired
    private FhirService fhirService;
    @PostMapping
    public String receivePatientData(@RequestBody String patientJson) throws Exception {
        System.out.println("=== PATIENTENDATEN IM BACKEND EMPFANGEN ===");
        System.out.println(patientJson);
        ObjectMapper mapper = new ObjectMapper();
        PatientEntity entity = mapper.readValue(patientJson, PatientEntity.class);
        patientRepository.save(entity);
        String json = fhirService.jsonFHIR(patientJson);
        System.out.println(json);
        System.out.println("==========================================");
        return "Patientendaten erfolgreich empfangen und in Datenbank gespeichert!";
    }
}