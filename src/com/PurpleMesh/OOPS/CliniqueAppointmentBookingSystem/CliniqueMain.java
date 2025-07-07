package com.PurpleMesh.OOPS.CliniqueAppointmentBookingSystem;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

import com.PurpleMesh.Utility.Utility;
import com.fasterxml.jackson.databind.JsonNode;

public class CliniqueMain {

    public static final List<String> TIME_SLOTS = Arrays.asList(
        "8AM", "9AM", "10AM", "11AM", "12PM", "1PM", "2PM", "3PM",
        "4PM", "5PM", "6PM", "7PM", "8PM"
    );

    public static void main(String[] args) throws IOException {

        CliniqueManager cliniqueManager = new CliniqueManager();

<<<<<<< HEAD
        // Load doctor data
=======
>>>>>>> 7a66887 (second commit)
        JsonNode jsonDoctorNode = Utility.mapper.readTree(new File("doctors.json"));
        for (int i = 0; i < jsonDoctorNode.size(); i++) {
            JsonNode doc = jsonDoctorNode.get(i);
            Doctor docList = new Doctor(
                doc.get("name").asText(),
                doc.get("id").asInt(),
                doc.get("specialization").asText(),
                doc.get("availability").asText()
            );
            cliniqueManager.addDoctors(docList);
        }

<<<<<<< HEAD
        // Load patient data
=======
>>>>>>> 7a66887 (second commit)
        JsonNode jsonPatientNode = Utility.mapper.readTree(new File("patients.json"));
        for (int i = 0; i < jsonPatientNode.size(); i++) {
            JsonNode patient = jsonPatientNode.get(i);
            Patient patientList = new Patient(
                patient.get("name").asText(),
                patient.get("id").asInt(),
                patient.get("mobile").asText(),
                patient.get("age").asInt()
            );
            cliniqueManager.addPatients(patientList);
        }

<<<<<<< HEAD
        System.out.println("🏥 Welcome to Clinique Hourly Appointment Booking");
=======
        System.out.println(" Welcome to Clinique Hourly Appointment Booking");
>>>>>>> 7a66887 (second commit)
        System.out.print("Enter Patient Name: ");
        String patientName = Utility.getNextLine();

        List<Patient> foundPatients = cliniqueManager.searchPatients(patientName);
        if (foundPatients.isEmpty()) {
            System.out.println(" Patient not found.");
            return;
        }
        Patient patient = foundPatients.get(0);

        System.out.print("Enter Doctor Name: ");
        String doctorName = Utility.getNextLine();
        List<Doctor> foundDoctors = cliniqueManager.searchDoctors(doctorName);
        if (foundDoctors.isEmpty()) {
            System.out.println(" Doctor not found.");
            return;
        }
        Doctor doctor = foundDoctors.get(0);

<<<<<<< HEAD
        System.out.println("Available Time Slots:");
        for (int i = 0; i < TIME_SLOTS.size(); i++) {
            System.out.println((i + 1) + ". " + TIME_SLOTS.get(i));
        }

        System.out.print("Choose time slot number (1 to " + TIME_SLOTS.size() + "): ");
        int slotChoice = Utility.getNextInt();
        Utility.getNextLine();

        if (slotChoice < 1 || slotChoice > TIME_SLOTS.size()) {
            System.out.println("Invalid time slot.");
            return;
        }

        String chosenSlot = TIME_SLOTS.get(slotChoice - 1);
        String slotType = chosenSlot.endsWith("AM") ? "AM" : "PM";

        if (!doctor.availability.equalsIgnoreCase("Both")
                && !doctor.availability.equalsIgnoreCase(slotType)) {
            System.out.println("Doctor not available at " + chosenSlot);
            return;
        }

        cliniqueManager.bookAppoinment(doctor, patient, chosenSlot, LocalDate.now());
=======
        while (true) {
            System.out.println("Available Time Slots:");
            for (int i = 0; i < TIME_SLOTS.size(); i++) {
                System.out.println((i + 1) + ". " + TIME_SLOTS.get(i));
            }

            System.out.print("Choose time slot number (1 to " + TIME_SLOTS.size() + "): ");
            int slotChoice = Utility.getNextInt();
            Utility.getNextLine();

            if (slotChoice < 1 || slotChoice > TIME_SLOTS.size()) {
                System.out.println("Invalid time slot.");
                continue;
            }

            String chosenSlot = TIME_SLOTS.get(slotChoice - 1);
            String slotType = chosenSlot.endsWith("AM") ? "AM" : "PM";

            if (!doctor.availability.equalsIgnoreCase("Both")
                    && !doctor.availability.equalsIgnoreCase(slotType)) {
                System.out.println("Doctor not available at " + chosenSlot);
                continue;
            }

            boolean booked = cliniqueManager.bookAppoinment(doctor, patient, chosenSlot, LocalDate.now());
            if (booked) {
                break;
            } else {
                System.out.println("Please choose a different time slot.\n");
            }
        }

>>>>>>> 7a66887 (second commit)
        cliniqueManager.printAppointments();
    }
}
