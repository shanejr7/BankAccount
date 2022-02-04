package com.hcl.hospital.comparable;

import java.util.Comparator;

import com.hcl.hospital.patients.PatientCLI;

public class PatientSortAge implements Comparator<PatientCLI> {

	@Override
	public int compare(PatientCLI o1, PatientCLI o2) {
		return Integer.compare(o1.getId(), o2.getId());
	}

}
