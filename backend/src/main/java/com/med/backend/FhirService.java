package com.med.backend;

import org.springframework.stereotype.Service;
import org.hl7.fhir.r4.model.Patient;
import ca.uhn.fhir.context.FhirContext;
import org.hl7.fhir.r4.model.HumanName;
@Service
public class FhirService {
    public String jsonFHIR(String patientJson) {
        FhirContext ctx = FhirContext.forR4();
        Patient patient = new Patient();
        
        HumanName name = patient.addName();
        name.setFamily("Nachname");
        name.addGiven("Vorname");
        return ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(patient);
    }
}
