

const patientForm = document.getElementById('PatientForm');

patientForm.addEventListener('submit', function(event) {
    event.preventDefault();

    const formData = new FormData(patientForm);
    const dataObject = Object.fromEntries(formData);

    const patientJSON = JSON.stringify(dataObject, null, 2);


    console.log(patientJSON);
});

