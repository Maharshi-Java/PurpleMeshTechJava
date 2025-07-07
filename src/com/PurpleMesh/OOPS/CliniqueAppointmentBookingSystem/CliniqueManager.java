package com.PurpleMesh.OOPS.CliniqueAppointmentBookingSystem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CliniqueManager {
	
	List<Doctor> doctors = new ArrayList<>();
	List<Patient> patients= new ArrayList<>();
	List<Appointment> appointments= new ArrayList<>();
<<<<<<< HEAD
	
=======
	 
>>>>>>> 7a66887 (second commit)
	public void addDoctors(Doctor d)
	{
		doctors.add(d);
	}
	
	public void addPatients(Patient p) {
		patients.add(p);
		
	}
	
	public List<Doctor> searchDoctors(String key)
	{
		List<Doctor> resultDoctors = new ArrayList<Doctor>();
		
		for(Doctor d: doctors)
		{
			if(d.name.equalsIgnoreCase(key) || String.valueOf(d.id).equals(key))
			{
				resultDoctors.add(d);
			}
		}
		return resultDoctors;
	}
	
	
	public List<Patient> searchPatients(String key)
	{
		List<Patient> resultPatients = new ArrayList<Patient>();
		
		for(Patient p: patients)
		{
			if(p.name.equalsIgnoreCase(key) || String.valueOf(p.id).equals(key))
			{
				resultPatients.add(p);
			}
		}
		
		return resultPatients;
	}
	
	
	public boolean bookAppoinment(Doctor doctor, Patient patient, String slot, LocalDate date)
	{
		long count=appointments.stream().filter(a->a.doctor.id == doctor.id && a.slot.equalsIgnoreCase(slot) && a.date.equals(date))
	            .count();
		
<<<<<<< HEAD
		if(count>5)
=======
		if(count>=5)
>>>>>>> 7a66887 (second commit)
		{
            System.out.println("Doctor already has 5 appointments at " + slot + ". Choose a different time.");
			return false;
		}
		
		appointments.add(new Appointment(doctor, patient, slot, date));
        System.out.println("Appointment booked for " + patient.name + " with Dr. " + doctor.name + " at " + slot + " on " + date);
        return true;
	}
	public void printAppointments() {
        System.out.println("Doctor-Patient Appointment Report:");
        for (Appointment a : appointments) {
            System.out.println("Dr. " + a.doctor.name + " -> " + a.patient.name + " at " + a.slot + " on " + a.date);
        }
    }
	

}
