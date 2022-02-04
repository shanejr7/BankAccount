package com.hcl.app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import com.hcl.hospital.doctor.*;
import com.hcl.hospital.patients.*;

/**
 * 
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hospital Application\n\n");

		// INSTANTIATE DOCTORS

		ArrayList<DoctorCLI> doctors = new ArrayList<DoctorCLI>();

		DoctorCLI d = new DoctorCLI(4, "Ann", "Surgery");

		doctors.add(d);

		d = new DoctorCLI(11, "Mark", "Internal medicine");
		doctors.add(d);

		d = new DoctorCLI(1, "Zane", "Pediatrics");
		doctors.add(d);

		d = new DoctorCLI(5, "Kane", "Pediatrics");
		doctors.add(d);

		// INSTANTIATE PATIENTS

		ArrayList<PatientCLI> patients = new ArrayList<PatientCLI>();

		PatientCLI p = new PatientCLI(3, "Spencer", 24);

		patients.add(p);

		p = new PatientCLI(1, "Marilyn", 37);
		patients.add(p);

		p = new PatientCLI(8, "Adam", 31);
		patients.add(p);

		p = new PatientCLI(7, "Molly", 17);
		patients.add(p);

		// SORT DOCTOR BY ID

		System.out.println("DoctorSort by id\n");

		Collections.sort(doctors);

		for (DoctorCLI dArr : doctors) {
			System.out.println(dArr.getId() + " " + dArr.getDoctorName() + " " + dArr.getSpecialty());

		}

		System.out.println("\n");

		// SORT DOCTOR BY NAME

		System.out.println("DoctorSort by name\n");

		Comparator<DoctorCLI> doctorSorter = (o1, o2) -> o1.getDoctorName().compareTo(o2.getDoctorName());

		Collections.sort(doctors, doctorSorter);

		for (DoctorCLI dArr : doctors) {
			System.out.println(dArr.getId() + " " + dArr.getDoctorName() + " " + dArr.getSpecialty());

		}

		System.out.println("\n");

		// SORT DOCTOR BY SPECIALTY

		System.out.println("DoctorSort by specialty\n");

		doctorSorter = (o1, o2) -> o1.getSpecialty().compareTo(o2.getSpecialty());

		Collections.sort(doctors, doctorSorter);

		for (DoctorCLI dArr : doctors) {
			System.out.println(dArr.getId() + " " + dArr.getDoctorName() + " " + dArr.getSpecialty());

		}

		System.out.println("\n");

		// SORT PATIENT BY ID

		System.out.println("PatientSort by ID\n");

		Collections.sort(patients);

		for (PatientCLI pArr : patients) {
			System.out.println(pArr.getId() + " " + pArr.getPatientName() + " " + pArr.getAge());

		}

		System.out.println("\n");

		// SORT PATIENT BY NAME

		System.out.println("PatientSort by name\n");

		Comparator<PatientCLI> patientSorter = (o1, o2) -> o1.getPatientName().compareTo(o2.getPatientName());

		Collections.sort(patients, patientSorter);

		for (PatientCLI pArr : patients) {
			System.out.println(pArr.getId() + " " + pArr.getPatientName() + " " + pArr.getAge());

		}

		System.out.println("\n");

		// SORT PATIENT BY AGE

		System.out.println("PatientSort by age\n");

		patientSorter = (o1, o2) -> Integer.compare(o1.getAge(), o2.getAge());

		Collections.sort(patients, patientSorter);

		for (PatientCLI pArr : patients) {

			System.out.println(pArr.getId() + " " + pArr.getPatientName() + " " + pArr.getAge());

		}

	}

}
