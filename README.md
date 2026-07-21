# fhir-pi-gateway

# Medical Data Ingestion Pipeline (FHIR Bridge)

Ein End to End Projekt zur Erfassung von Gesundheitsdaten über eine Web-Oberfläche,
Transformation in den **HL7 FHIR Standard** auf einem Raspberry Pi und anschließendem Upload zu Google Drive.

**Frontend (HTML/CSS/JS):** 
Erfassung der Nutzerdaten über ein Web-Formular und Weiterleitung per HTTP-POST. **Backend (Raspberry Pi / Java Spring Boot):**
   - Empfängt die Rohdaten vom Frontend.
   - Konvertiert die Daten mit **HAPI FHIR** in eine valide FHIR-Ressource.
   - Validiert das FHIR.
   - Lädt die finale .json Datei über die Google Drive API hoch.
**Storage (Google Drive):** 
Ablage der validierten FHIR-Dateien.

- **Frontend:** HTML5, CSS3, Vanilla JavaScript 
- **Backend:** Java, Spring Boot
- **FHIR Framework:** HAPI FHIR (R4)
- **Cloud Integration:** Google Drive API 
- **Hardware:** Raspberry Pi

