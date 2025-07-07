package com.PurpleMesh.OOPS.CliniqueAppointmentBookingSystem;

import java.time.LocalDate;

public class Appointment {

	public Doctor doctor;
    public Patient patient;
    public String slot; 
    public LocalDate date;
    
	public Appointment(Doctor doctor, Patient patient, String slot, LocalDate date) {
		super();
		this.doctor = doctor;
		this.patient = patient;
<<<<<<< HEAD
		this.slot = slot;
=======
		this.slot = slot; 
>>>>>>> 7a66887 (second commit)
		this.date = date;
	}
    
    
}
