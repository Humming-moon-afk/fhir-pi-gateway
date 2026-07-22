package com.med.backend;

import org.springframework.stereotype.Service;
import org.hl7.fhir.r4.model.Patient;
import ca.uhn.fhir.context.FhirContext;
import org.hl7.fhir.r4.model.HumanName;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
@Service
public class FhirService {
    public String jsonFHIR(String patientJson) throws Exception {
        FhirContext ctx = FhirContext.forR4();
        Patient patient = new Patient();
        ObjectMapper mapper = new ObjectMapper();
        JsonNode rootNode = mapper.readTree(patientJson);
        String vorname = rootNode.get("firstName").asText();
        String nachname = rootNode.get("lastName").asText();

        HumanName name = patient.addName();
        name.addGiven(vorname);
        name.setFamily(nachname);
        return ctx.newJsonParser().setPrettyPrint(true).encodeResourceToString(patient);
    }
}
