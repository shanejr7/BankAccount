package com.hcl.hospital.comparable;

import java.util.Comparator;

import com.hcl.hospital.patients.PatientCLI;

public class PatientNameSort implements Comparator<PatientCLI> {

	@Override
	public int compare(PatientCLI o1, PatientCLI o2) {

		return o1.getPatientName().compareTo(o2.getPatientName());
	}

}
